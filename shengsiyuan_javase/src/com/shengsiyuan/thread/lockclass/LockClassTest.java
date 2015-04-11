package com.shengsiyuan.thread.lockclass;

public class LockClassTest {

	public static void main(String[] args) {
		
		Thread m1Thread = new InvokeM1Thread();
		Thread m2Thread = new InvokeM2Thread();
		Thread m3Thread = new InvokeM3Thread();
		m1Thread.start();
		m2Thread.start();
		m3Thread.start();
	}

}


