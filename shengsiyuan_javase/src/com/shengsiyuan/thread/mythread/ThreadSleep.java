package com.shengsiyuan.thread.mythread;

public class ThreadSleep {
	public static void main(String[] args) {
	
		Thread t1 = new Thread(new Sleep());
		t1.start();
	}
}

class Sleep implements Runnable{
	
	public void run() {
		
		for(int i=0;i<100;i++){
			System.err.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};
}