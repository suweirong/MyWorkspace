package com.shengsiyuan.thread;



public class ThreadNameTest {

	public static void main(String[] args) {
		
		//ͨ�����̣߳��Ѽ����߳����񶼼ӵ�һ����������
		Thread5 thread5 = new Thread5();
		Thread6 thread6 = new Thread6("xxx");//ͨ����̬��������ֵ
		System.out.println(thread5.getName());
		System.out.println(thread6.getName());
		thread5.start();
		thread6.start();
	}
}

//����һ���߳�ִ��һ������
class Thread5 extends Thread{
	@Override
	public void run() {
		for(int i =0;i<100;i++){
			System.out.println("hello world: "+i);
		}
	}

}

//�����ڶ����߳�ִ��һ������
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
