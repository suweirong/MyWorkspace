package com.shengsiyuan.thread.mythread;

public class Test1 {

	public static void main(String[] args) {
		AddSub addSub = new AddSub();
		//����ͬһ��Դ
		Thread adThread = new MyAddTh1(addSub);//һ���̣߳�ĳ��������һ������
		Thread sbThread = new MySubTh1(addSub);//һ���̣߳�ĳ��������һ������    
		sbThread.start();
		adThread.start();
	}
}

//������

class AddSub{
	private	int i=0;
	
	//��֤������������Ӱ�죬��Ҫͬ��
	
	public  synchronized void add(){
		while(true){
			i++;
			System.out.println(i);
		}
	}
	
	public  synchronized void sub(){
		i--;
		System.out.println(i);
	}
	
}
 //���������ӷ������߳�,Ҫ��������,���ݶ���
class MyAddTh1 extends Thread{
	private AddSub a1;
	
	public MyAddTh1(AddSub as){
		this.a1=as;
	}
	
	@Override
	public void run() {
		a1.add();
	}
}

//�����������������߳�,Ҫ��������,���ݶ���
class MySubTh1 extends Thread{
	private AddSub a2;
	
	public MySubTh1(AddSub as){
		this.a2=as;
	}
	
	@Override
	public void run() {
		a2.sub();
	}
}