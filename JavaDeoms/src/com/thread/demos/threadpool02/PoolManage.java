package com.thread.demos.threadpool02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;


public class PoolManage {
	public static PoolManage mPool=new PoolManage();
	public final int max_pool =2;
	public final int max_Tasks = 15;
	public static ArrayList<Worker> init_pools;
	private int GetIdleThreadPollTime=50;//获取空闲线程轮询间隔时间,可配置
	private TaskMonitorThread mainThread;//任务监测线程

	static {
		init_pools = new ArrayList(1);
	}

	public static PoolManage getInstance() {
		if (mPool == null) {
			mPool = new PoolManage();
		}

		return mPool;
	}
	
	
	
	//获取空闲线程
	public  Worker getIdleThread(){
		Worker working =null;
		while(true){
			synchronized(init_pools){
				for (int i = 0; i < max_pool; i++) {
					//Worker working = init_pools.get(i);
					working = init_pools.get(i);//从线程池中逐个去除Worker线程，判断是否是空闲线程
					if (!working.isrunning) {
					//	System.out.println("工作将由闲置线程" + working.getThreadTag() + "执行");
						return working;
					}
				}
			}
			try {
				Thread.sleep(5000);//放弃CPU,若干时间后重新获取空闲线程
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	//初始化线程池，把worker线程放到线程池中，启动taskmonitor线程
	public void init() {
		System.out.println("线程池初始化开始。。。");
		Worker worker = null;
		//创建两个线程到线程池
		for (int i = 0; i < this.max_pool; i++) {
			worker = new Worker("initThread"+i);
			init_pools.add(worker);
			worker.start();
		}
		mainThread=new  TaskMonitorThread();
		mainThread.start();
		System.out.println("结束初始化线程池...");

	}
	

}