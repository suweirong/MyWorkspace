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
	
	//保证两个方法互不影响，需要同步,并切换操作一个资源
	/*
	 * 首先两个方法操作一个资源不让异步干扰
	 * 然后加入条件
	 * 
	 */
	
	//该方法进行某种操作，由于同步，所以执行时持有锁，我们让它到某个条件时不操作，即释放锁。
	public  synchronized void add(){
		//这为不满足条件时，不操作，释放锁
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
		//不满足条件，不执行，释放锁，唤醒其他线程持有锁
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


//创建针对类加方法的线程,要持有引用,传递对象
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

//创建针对类减方法的线程,要持有引用,传递对象
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