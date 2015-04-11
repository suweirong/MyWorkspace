package com.shengsiyuan.thread.deadlock;

public class DeadLock implements Runnable {

	A a = new A();
	B b = new B();
	
	public void init(){
		Thread.currentThread().setName("Main Thread");
		a.foo(b);
		System.err.println("after running main thread");
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread.currentThread().setName("vice Thread");
		b.bar(a);
		System.out.println("after running vice Thread");
	}
	
	public static void main(String[] args) {
		DeadLock dl = new DeadLock();
		new Thread(dl).start();
		dl.init();
	}

}
