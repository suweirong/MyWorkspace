package com.shengsiyuan.thread.mythread;

public class YieldThread extends Thread{

	public YieldThread() {
		// TODO Auto-generated constructor stub
	}
	public YieldThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(int i=0;i<100;i++){
			System.out.println(getName()+" "+i);
			if (i==40) {
				Thread.yield();//到就绪状态，线程给优先级大于等于自己的，或者自己
			}
		}
	}
	public static void main(String[] args) {
		YieldThread y1 = new YieldThread("高级");
		y1.setPriority(Thread.MAX_PRIORITY);
		YieldThread y2 = new YieldThread("低级");
		y2.setPriority(Thread.MIN_PRIORITY);
		y2.start();
		y1.start();
		YieldThread y3 = new YieldThread("高级3");
		y3.setPriority(Thread.MAX_PRIORITY);
		y3.start();
	}
	
}
/*
*yield后让高于等于自己的存在的线程，或自己执行
*/