package com.shengsiyuan.thread;

public class ThreadTest3 {

	public static void main(String[] args) {
		Runnable r = new Test3();
		Thread t1 = new Thread(r);
		r =new Test3();
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
	}
}

class Test3 implements Runnable{
//	int i;
	@Override
	public void run() {
		int i=0;//方法变量须赋值
		while(true){
			System.out.println("number: "+ i++);

			try {
				Thread.sleep((long)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(50==i){
				break;
			}
		}
	}
	
	
	
	
}
