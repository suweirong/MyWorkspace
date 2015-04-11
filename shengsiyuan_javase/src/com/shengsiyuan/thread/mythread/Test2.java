package com.shengsiyuan.thread.mythread;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		AddSub2 adSub2 = new AddSub2();
		
		Thread t1 = new MyAddTh2(adSub2);
		Thread t2 = new MySubTh2(adSub2);
		t1.start();
		t2.start();
	}

}

class AddSub2{
	private	int i=0;
	
	//��֤������������Ӱ�죬��Ҫͬ��,���л�����һ����Դ
	/*
	 * ����������������һ����Դ�����첽����
	 * Ȼ���������
	 * 
	 */
	
	//�÷�������ĳ�ֲ���������ͬ��������ִ��ʱ������������������ĳ������ʱ�����������ͷ�����
	public  synchronized void add(){
		//��Ϊ����������ʱ�����������ͷ���
		while(true){
		if(0!=i){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			System.out.println(++i);;
			notify();
		
		}
		}	
	}
	
	public  synchronized void sub(){
		//��������������ִ�У��ͷ��������������̳߳�����
		while(true){
		if(1!=i){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			System.out.println(--i);}
			notify();
		}
	}
}


//���������ӷ������߳�,Ҫ��������,���ݶ���
class MyAddTh2 extends Thread{
	private AddSub2 a1;
	
	public MyAddTh2(AddSub2 as){
		this.a1=as;
	}
	
	@Override
	public void run() {
		a1.add();
	}
}

//�����������������߳�,Ҫ��������,���ݶ���
class MySubTh2 extends Thread{
	private AddSub2 a2;
	
	public MySubTh2(AddSub2 as){
		this.a2=as;
	}
	
	@Override
	public void run() {
		a2.sub();
	}
}