package com.shengsiyuan.thread.mythread;

public class YieldThread extends Thread{

	public YieldThread() {
		// TODO Auto-generated constructor stub
	}
	public YieldThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(int i=0;i<100;i++){
			System.out.println(getName()+" "+i);
			if (i==40) {
				Thread.yield();//������״̬���̸߳����ȼ����ڵ����Լ��ģ������Լ�
			}
		}
	}
	public static void main(String[] args) {
		YieldThread y1 = new YieldThread("�߼�");
		y1.setPriority(Thread.MAX_PRIORITY);
		YieldThread y2 = new YieldThread("�ͼ�");
		y2.setPriority(Thread.MIN_PRIORITY);
		y2.start();
		y1.start();
		YieldThread y3 = new YieldThread("�߼�3");
		y3.setPriority(Thread.MAX_PRIORITY);
		y3.start();
	}
	
}
/*
*yield���ø��ڵ����Լ��Ĵ��ڵ��̣߳����Լ�ִ��
*/