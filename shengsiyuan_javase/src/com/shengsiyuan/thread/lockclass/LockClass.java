package com.shengsiyuan.thread.lockclass;

public class LockClass{

	public static void method1() throws InterruptedException{
		
		synchronized(LockClass.class){
			System.out.println("method1 start..");
			Thread.sleep(10000);
			System.out.println("method1 end..");
		}
		
	}
	
	public static void method2() throws InterruptedException{
		synchronized(LockClass.class){
			for(int i=0;i<10;i++){
				Thread.sleep(1000);
				System.out.println("method2 running..");
			}
		}
	}
	
	public static void method3() throws InterruptedException{
		for(int i=0;i<10;i++){
			Thread.sleep(1000);
			System.out.println("method3 running..");
		}
	}	
}
