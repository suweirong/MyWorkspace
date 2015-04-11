package com.shengsiyuan.designpattern.Singleton;

//�Ƚ϶��̲߳�������
//���ֵ���ģʽ���ڶ��߳�����£����ڶ��̹߳������ݣ���ɷ��ʸ��ţ���Ϊ����ʱ��ÿ�ֵ���޷���֤������ֻ�е��߳��²��ܱ�֤������һ��ִ�к���һ��ִ��
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
	//�Կ�ʼ��ʱ��Ϊ�գ����̲߳���һ��ʼ����ͬʱ��ÿգ�֮��
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

//ͨ��Thread���Զ��̲߳���һ����Ĳ�ͬ���󣬵�����ͬ�����޷�����,�����õ�����ֻ��һ��ʵ���������

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