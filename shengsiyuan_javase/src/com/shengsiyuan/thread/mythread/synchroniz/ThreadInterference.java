package com.shengsiyuan.thread.mythread.synchroniz;

public class ThreadInterference {

	public static void main(String[] args) {
		Counter ct = new Counter();
		Thread t1 = new Increment(ct);
		Thread t2 = new Decrement(ct);
		t1.start();
		t2.start();
		System.out.println(ct.c);
	}
}


class Counter {
    public int c = 0;

    public void increment() {
        c++;
    }

    public void decrement() {
        c--;
    }

    public int value() {
        return c;
    }

}

class Increment extends Thread{
	private Counter ct;
	
	public Increment(Counter ct){
		this.ct=ct;
	}
	
	@Override
	public void run() {
		ct.increment();
	}
	
	
}

class Decrement extends Thread{
	private Counter ct;
	
	public Decrement(Counter ct){
		this.ct=ct;
	}
	
	@Override
	public void run() {
		ct.decrement();
	}
	
	
}