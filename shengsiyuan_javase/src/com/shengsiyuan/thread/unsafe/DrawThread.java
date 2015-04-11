package com.shengsiyuan.thread.unsafe;

public class DrawThread extends Thread {

	private Account account;
	private double drawAmount;

	public DrawThread(String name, Account account, double drawAmount) {
		super(name);
		this.account = account;
		this.drawAmount = drawAmount;
	}
	
	public void run(){
		if(account.getBalance()>=drawAmount){
			System.out.println(getName()+"get money success!get:"+drawAmount);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			account.setBalance(account.getBalance()-drawAmount);
			System.out.println("\t money left: " +account.getBalance());
		}
		
		else{
			System.out.println(getName()+"failed!no money left!");
		}
	}
	
	
	

}
