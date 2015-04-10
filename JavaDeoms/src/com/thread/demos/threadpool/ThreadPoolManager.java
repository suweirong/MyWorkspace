package com.thread.demos.threadpool;

import java.util.Vector;

/**
 * 一个线程池包括以下四个基本组成部分：
       1、线程池管理器（ThreadPool）：用于创建并管理线程池，包括 创建线程池，销毁线程池，添加新任务；
       2、工作线程（PoolWorker）：线程池中线程，在没有任务时处于等待状态，可以循环的执行任务；
       3、任务接口（Task）：每个任务必须实现的接口，以供工作线程调度任务的执行，
       		它主要规定了任务的入口，任务执行完后的收尾工作，任务的执行状态等；
       4、任务队列（taskQueue）：用于存放没有处理的任务。提供一种缓冲机制。
 */

/**
 * 线程池管理器
 * @author Administrator
 *
 */
public class ThreadPoolManager {
	public static final int MAX_THREADS=200;				//最大线程数
	public static final int MAX_SPARE_THREADS=50;			//最大空闲线程数
	public static final int MIN_SPARE_THREADS=10;			//最小空闲线程数
	
	private Vector<WorkThread> pool;	//工作线程队列
	private MonitorRunnable monitor; // 监控线程内部类全局变量
	
	private int maxThreads;
	private int minSpareThreads;
	private int maxSpareThreads;
	private int currentThreadCount;		//当前线程数量
	private int currentThreadsBusy;		//当前繁忙线程的数量
	private boolean stopThePool;		//关闭线程池的标志
	
	/*
	 * 初始化线程池
	 */
	public ThreadPoolManager() {
		maxThreads = MAX_THREADS;
		maxSpareThreads = MAX_SPARE_THREADS;
		minSpareThreads = MIN_SPARE_THREADS;
		//默认当前线程、当前繁忙线程、线程池关闭标识分别为0、0、false
		currentThreadCount = 0;
		currentThreadsBusy = 0;
		stopThePool = false;
	}
	
	public synchronized void start(){
		//计算最大空闲线程和最小空闲线程
		adjustLimits();
		
		openThreads(minSpareThreads);
		
		//启动监控线程，程序开始运行
		monitor=new MonitorRunnable(this);
	}
	
	/*
	 * 这个方法给外部调用，把具体的任务传进来。
	 * 从这个方法可以看到，它实际上是把任务接过来，判断当前线程有多少，有空闲的就到池里面去取，
	 * 实际上是调用池里面的WorkThread线程来干活
	 */
	public synchronized void runIt(Task task){
		if(task==null){
			throw new NullPointerException("任务为空");
		}
		
		if(currentThreadCount==0||stopThePool){
			throw new IllegalStateException("没有线程在运行");
		}
		
		WorkThread thread=null;
		synchronized (this) {
			if(currentThreadCount==currentThreadsBusy){
				if(currentThreadCount<maxThreads){
					int toOpen=currentThreadCount+minSpareThreads;
					openThreads(toOpen);
				}else{
					while(currentThreadCount==currentThreadsBusy){
						try {
							this.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						if(currentThreadCount==0||stopThePool){
							throw new IllegalStateException("没有线程在运行");
						}
					}
				}
			}
			// 找到pool里最末端的一个线程。然后从pool里除去，currentThreadsBusy加1，表示忙的线程多一个了。
			thread=pool.lastElement();
			pool.removeElement(thread);
			currentThreadsBusy++;
		}
		
		// 上面从pool里取出来线程了ControlRunnable，调用它的runIt方法，开始运行
		thread.runIt(task);
	}
	
	/*
	 * 检测线程数量
	 * 如果当前线程个数 － 正在繁忙的线程 比 最大空闲线程数大,释放多余的空闲线程
	 */
	public synchronized void checkSpareThreads(){
		if(stopThePool){
			return;
		}
		if(currentThreadCount-currentThreadsBusy>maxSpareThreads){
			int toFree=currentThreadCount-currentThreadsBusy-maxSpareThreads;
			for(int i=0;i<toFree;i++){
				WorkThread thread=pool.firstElement();
				pool.removeElement(thread);
				thread.shutdown();
				currentThreadCount--;
			}
		}
	}
	
	/*
	 * 关闭线程池
	 */
	public synchronized void shutdown(){
		if(!stopThePool){
			stopThePool=true;
			monitor.shutdown();
			monitor=null;
			for(int i=0;i<(currentThreadCount-currentThreadsBusy);i++){
				WorkThread thread=pool.elementAt(i);
				thread.shutdown();
			}
			currentThreadCount=currentThreadsBusy=0;
			pool=null;
			notifyAll();
		}
	}
	
	/*
	 * 回收工作线程
	 */
	public synchronized void returnWorkThread(WorkThread work){
		if(currentThreadCount==0||stopThePool){
			work.shutdown();
			return;
		}
		currentThreadsBusy--;
		pool.addElement(work);
	}
	
	/*
	 * 计算最大空闲线程和最小空闲线程
	 */
	private void adjustLimits(){

		if (maxThreads <= 0) {
			maxThreads = MAX_THREADS;
		}
		if (maxSpareThreads >= maxThreads) {
			maxSpareThreads = maxThreads;
		}
		if (maxSpareThreads <= 0) {
			if (1 == maxThreads) {
				maxSpareThreads = 1;
			} else {
				maxSpareThreads = maxThreads / 2;
			}
		}
		if (minSpareThreads > maxSpareThreads) {
			minSpareThreads = maxSpareThreads;
		}
		if (minSpareThreads <= 0) {
			if (1 == maxSpareThreads) {
				minSpareThreads = 1;
			} else {
				minSpareThreads = maxSpareThreads / 2;
			}
		}
	
	}
	
	/*
	 * 创建线程池
	 */
	private void openThreads(int toOpen){
		if(toOpen>maxThreads){
			toOpen=maxThreads;
		}
		if(0==currentThreadCount){
			// 初始开minSpareThreads 10个元素
			pool=new Vector<WorkThread>(toOpen);
		}
				
		for(int i=currentThreadCount;i<toOpen;i++){
			WorkThread thread=new WorkThread(this);
			pool.addElement(thread);
		}
		currentThreadCount=toOpen;		//当前线程个数
	}
	
	
	/**
	 * @return the pool
	 */
	public Vector<WorkThread> getPool() {
		return pool;
	}
	/**
	 * @param pool the pool to set
	 */
	public void setPool(Vector<WorkThread> pool) {
		this.pool = pool;
	}
	/**
	 * @return the maxThreads
	 */
	public int getMaxThreads() {
		return maxThreads;
	}
	/**
	 * @param maxThreads the maxThreads to set
	 */
	public void setMaxThreads(int maxThreads) {
		this.maxThreads = maxThreads;
	}
	/**
	 * @return the minSpareThreads
	 */
	public int getMinSpareThreads() {
		return minSpareThreads;
	}
	/**
	 * @param minSpareThreads the minSpareThreads to set
	 */
	public void setMinSpareThreads(int minSpareThreads) {
		this.minSpareThreads = minSpareThreads;
	}
	/**
	 * @return the maxSpareThreads
	 */
	public int getMaxSpareThreads() {
		return maxSpareThreads;
	}
	/**
	 * @param maxSpareThreads the maxSpareThreads to set
	 */
	public void setMaxSpareThreads(int maxSpareThreads) {
		this.maxSpareThreads = maxSpareThreads;
	}
	/**
	 * @return the currentThreadCount
	 */
	public int getCurrentThreadCount() {
		return currentThreadCount;
	}
	/**
	 * @param currentThreadCount the currentThreadCount to set
	 */
	public void setCurrentThreadCount(int currentThreadCount) {
		this.currentThreadCount = currentThreadCount;
	}
	/**
	 * @return the currentThreadsBusy
	 */
	public int getCurrentThreadsBusy() {
		return currentThreadsBusy;
	}
	/**
	 * @param currentThreadsBusy the currentThreadsBusy to set
	 */
	public void setCurrentThreadsBusy(int currentThreadsBusy) {
		this.currentThreadsBusy = currentThreadsBusy;
	}
	/**
	 * @return the stopThePool
	 */
	public boolean isStopThePool() {
		return stopThePool;
	}
	/**
	 * @param stopThePool the stopThePool to set
	 */
	public void setStopThePool(boolean stopThePool) {
		this.stopThePool = stopThePool;
	}
}
