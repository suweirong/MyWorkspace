package com.thread.demos.threadpool;


/**
 * 监控线程
 * @author Administrator
 *
 */
public class MonitorRunnable implements Runnable {
	private ThreadPoolManager manager;
	private boolean shutdown;
	private Thread thread;
	private static final int WORK_WAIT_TIMEOUT = 60 * 1000; // 超时时间
	
	public MonitorRunnable(ThreadPoolManager manager) {
		super();
		this.manager = manager;
		shutdown=false;
		thread=new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		while(true){
			synchronized (this) {
				try {
					this.wait(WORK_WAIT_TIMEOUT);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			//是否要中止运行
			if(shutdown){
				break;
			}
			//一直检测当前线程数，如果当前线程个数 － 正在繁忙的线程 比 最大空闲线程数大,释放多的线程
			manager.checkSpareThreads();
		}
	}
	
	public synchronized void shutdown(){
		shutdown=true;
		this.notify();
	}
}
