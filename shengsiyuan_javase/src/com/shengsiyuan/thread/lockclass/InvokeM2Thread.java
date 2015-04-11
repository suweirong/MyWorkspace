package com.shengsiyuan.thread.lockclass;

public class InvokeM2Thread extends Thread {

	public void run() {
		try {
			LockClass.method2();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
