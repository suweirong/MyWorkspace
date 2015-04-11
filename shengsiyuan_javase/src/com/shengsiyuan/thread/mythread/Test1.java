package com.shengsiyuan.thread.mythread;

public class Test1 {

	public static void main(String[] args) {
		AddSub addSub = new AddSub();
		//操作同一资源
		Thread adThread = new MyAddTh1(addSub);//一个线程，某个方法，一个对象
		Thread sbThread = new MySubTh1(addSub);//一个线程，某个方法，一个对象    
		sbThread.start();
		adThread.start();
	}
}

//创建类

class AddSub{
	private	int i=0;
	
	//保证两个方法互不影响，需要同步
	
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
 //创建针对类加方法的线程,要持有引用,传递对象
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

//创建针对类减方法的线程,要持有引用,传递对象
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