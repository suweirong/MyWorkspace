package com.shengsiyuan.designpattern.Singleton;

//比较多线程操作单例
//这种单例模式，在多线程情况下，由于多线程共享数据，造成访问干扰，在为更改时获得空值，无法保证单例，只有单线程下才能保证单例，一个执行后另一个执行
public class DanliTest {

	static	DanliTest danliTest = null;
	private DanliTest(){
		
	}
	
	public static DanliTest getDanliTest() throws InterruptedException{
		if(danliTest==null){
			Thread.sleep(3000);
			danliTest = new DanliTest();
		}
		
		return danliTest;
	}
	//以开始的时候为空，多线程操作一开始可能同时获得空，之后
	public static void main(String[] args) {
		Thread m1 = new MyThread();
		Thread m2 = new MyThread();
		Thread m3 = new MyThread();
		Thread m4 = new MyThread();
		m1.start();
		m2.start();
		m3.start();
		m4.start();
		System.out.println(DanliTest.danliTest);
	}
}


//class MyThread implements Runnable{
//	
//	public MyThread() {
//	}
//	
//	@Override
//	public void run() {
//		DanliTest.getDanliTest();
//	}
//	
//	
//	
//}

//通过Thread可以多线程操作一个类的不同对象，但是相同对象无法操作,除非用单例，只有一个实例的情况下

class MyThread extends Thread{
	
	
	@Override
	public void run() {
		try {
			System.out.println(DanliTest.getDanliTest());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	
//	
//	
}