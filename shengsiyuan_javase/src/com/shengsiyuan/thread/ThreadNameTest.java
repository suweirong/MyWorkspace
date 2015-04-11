package com.shengsiyuan.thread;



public class ThreadNameTest {

	public static void main(String[] args) {
		
		//通过主线程，把几个线程任务都加到一个程序里面
		Thread5 thread5 = new Thread5();
		Thread6 thread6 = new Thread6("xxx");//通过静态变量赋名值
		System.out.println(thread5.getName());
		System.out.println(thread6.getName());
		thread5.start();
		thread6.start();
	}
}

//创建一个线程执行一个任务
class Thread5 extends Thread{
	@Override
	public void run() {
		for(int i =0;i<100;i++){
			System.out.println("hello world: "+i);
		}
	}

}

//创建第二个线程执行一个任务
class Thread6 extends Thread{
	
	public Thread6(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(int i =0;i<100;i++){
			System.out.println("welcome :"+i);
		}
	}

}
