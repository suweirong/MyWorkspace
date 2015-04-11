package com.shengsiyuan.thread.lock;

import java.util.concurrent.locks.ReentrantLock;

public class Account {

	private final ReentrantLock lock = new ReentrantLock();
	private String accountNo;
	private double balance;

	public Account() {
	}

	public Account(String accountNo, double balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}

	public int hashCode() {
		return accountNo.hashCode();
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public  void draw(double drawAmount) {

		lock.lock();

		try {
			if (balance >= drawAmount) {
				System.out.println(Thread.currentThread().getName() + "get money success!get:" + drawAmount);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				balance -= drawAmount;

				System.out.println("\t money left: " + balance);
			}

			else {
				System.out.println(Thread.currentThread().getName() + "failed!no money left!");
			}
		} finally {
			lock.unlock();
		}
	}

	public boolean equals(Object obj) {
		if (obj != null && obj.getClass() == Account.class) {
			Account target = (Account) obj;
			return target.getAccountNo().equals(accountNo);
		}
		return false;
	}
}
