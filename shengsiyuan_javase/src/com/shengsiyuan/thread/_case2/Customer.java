package com.shengsiyuan.thread._case2;
//消费者线程
class Consumer implements Runnable {
	SyncStack ss = null;
	Consumer(SyncStack ss) {
		this.ss = ss;
	}
	
	public void run() {
		for(int i=0; i<20; i++) {
			ManTou wt = ss.pop();
			System.out.println("消费了: " + wt);
			try {
				Thread.sleep((int)(Math.random() * 1000));  //消费 一个休息 一个随机数
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
	}
}