package com.shengsiyuan.thread.mythread;
//join��������ͣ��ǰ�̣߳�ʹjoin�߳���ִ��
public class Test3 {

	public static void main(String[] args) {
		new Thread3("�߳�1").start();
		
		for(int i=0;i<100;i++){
			if (i==20) {
				Thread3 thread3 = new Thread3("��join���߳�");
				thread3.start();
				try {
					thread3.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}


class Thread3 extends Thread{
	
	public Thread3(String name) {
		super(name);
	}
	@Override
	public void run() {
		
		for(int i=0;i<100;i++){
			System.out.println(getName()+" "+i);
		}
	}
	
	
	
	
	
}