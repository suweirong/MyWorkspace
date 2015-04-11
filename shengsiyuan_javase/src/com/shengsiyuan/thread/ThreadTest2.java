package com.shengsiyuan.thread;


public class ThreadTest2 {

	public static void main(String[] args) {
		
		//通过主线程，把几个线程任务都加到一个程序里面
		Thread thread1 = new Thread(new Thread3());
		Thread thread2 = new Thread(new Thread4());
		thread1.start();
		thread2.start();
	}
}

//创建一个线程执行一个任务
class Thread3 implements Runnable{
	@Override
	public void run() {
		for(int i =0;i<100;i++){
			System.out.println("hello world: "+i);
		}
	}

}

//创建第二个线程执行一个任务
class Thread4 implements Runnable{
	@Override
	public void run() {
		for(int i =0;i<100;i++){
			System.out.println("welcome :"+i);
		}
	}

}