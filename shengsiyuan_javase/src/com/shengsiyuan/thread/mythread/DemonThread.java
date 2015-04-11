package com.shengsiyuan.thread.mythread;

public class DemonThread extends Thread {
	
	@Override
	public void run() {
		for(int i=0;i<1000;i++){
			System.out.println(getName()+" "+i);
		}
	}
	
	public static void main(String[] args) {
		DemonThread t = new DemonThread();
		t.setDaemon(true);
		t.start();
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread()+" "+i);
		}
	}
	//前台线程结束后，后台线程会被通知准备死亡
	
}
