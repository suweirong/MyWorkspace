package com.shengsiyuan.thread;

public class ThreadTest {

	public static void main(String[] args) {
		
		//ͨ�����̣߳��Ѽ����߳����񶼼ӵ�һ����������
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		thread1.start();
		thread2.start();
	}
}

//����һ���߳�ִ��һ������
class Thread1 extends Thread{
	@Override
	public void run() {
		for(int i =0;i<100;i++){
			System.out.println("hello world: "+i);
		}
	}

}

//�����ڶ����߳�ִ��һ������
class Thread2 extends Thread{
	@Override
	public void run() {
		for(int i =0;i<100;i++){
			System.out.println("welcome :"+i);
		}
	}

}