package com.shengsiyuan.thread.lockclass;

public class InvokeM1Thread extends Thread {

	public void run() {
		try {
			LockClass.method1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
