package com.shengsiyuan.thread.safe2;

public class TestDraw {

	public static void main(String[] args) {
		Account acct = new Account("jason",1000);
		new DrawThread("jia ",acct,800).start();
		new DrawThread("yi ",acct,800).start();
	}
}
