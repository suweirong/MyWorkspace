package com.shengsiyuan.thread.deadlock;

public class A {
	
	public synchronized void foo(B b){
		System.out.println("Current Thread Name:"+Thread.currentThread().getName()+ " execute A's  method foo");
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Current Thread Name: "+Thread.currentThread().getName() + "trying to invoke B's  method last");
			b.last();
	}
	
	public synchronized void last(){
		System.out.println("running A's last method");
	}
}


class B {
	
	public synchronized void bar(A a){
		System.out.println("Current Thread Name:"+Thread.currentThread().getName()+ " execute B's  method bar");
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Current Thread Name: "+Thread.currentThread().getName() + "trying to invoke A's  method last");
			a.last();
	}
	
	public synchronized void last(){
		System.out.println("running B's last method");
	}
}
