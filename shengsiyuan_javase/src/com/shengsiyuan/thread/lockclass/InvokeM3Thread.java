package com.shengsiyuan.thread.lockclass;

public class InvokeM3Thread extends Thread {

	public void run() {
		try {
			LockClass.method3();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
