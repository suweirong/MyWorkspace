package com.shengsiyuan.thread;


public class ThreadTest2 {

	public static void main(String[] args) {
		
		//ͨ�����̣߳��Ѽ����߳����񶼼ӵ�һ����������
		Thread thread1 = new Thread(new Thread3());
		Thread thread2 = new Thread(new Thread4());
		thread1.start();
		thread2.start();
	}
}

//����һ���߳�ִ��һ������
class Thread3 implements Runnable{
	@Override
	public void run() {
		for(int i =0;i<100;i++){
			System.out.println("hello world: "+i);
		}
	}

}

//�����ڶ����߳�ִ��һ������
class Thread4 implements Runnable{
	@Override
	public void run() {
		for(int i =0;i<100;i++){
			System.out.println("welcome :"+i);
		}
	}

}