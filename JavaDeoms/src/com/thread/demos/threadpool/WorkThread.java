package com.thread.demos.threadpool;

/**
 * 工作线程
 * @author Administrator
 *
 */
public class WorkThread implements Runnable {
	
	
	//线程池管理器对象
	private ThreadPoolManager poolManager;
	private boolean shutdown;
	private boolean running;
	private Task task;
	private Thread thread;
		
	public WorkThread(ThreadPoolManager poolManager) {
		this.poolManager=poolManager;
		shutdown=false;
		running=false;
		task=null;
		thread=new Thread(this);
		thread.start();
	}
	
	@Override
	public void run() {
		while(true){
			synchronized (this) {
				if(!running&&!shutdown){
					try {
						this.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			if(shutdown){
				break;
			}
			try{
				task.execute();
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				task=null;
				running=false;
				poolManager.returnWorkThread(this);
			}
		}
	}
	
	/*
	 * 接收任务，并唤醒该线程
	 * 让线程开始运行
	 */
	public synchronized void runIt(Task task){
		if(task==null){
			throw new NullPointerException("该任务为Null");
		}	
		this.task=task;
		running=true;
		this.notify();
	}
	
	public synchronized void shutdown(){
		shutdown=true;
		this.notify();
	}
}
