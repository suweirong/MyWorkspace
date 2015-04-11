package com.shengsiyuan.thread._case2;
/**
 * 
 * 
 * @author tramp
 *装馒头的篮子
 */

public class SyncStack {
	int index = 0;
	ManTou[] arrWT = new ManTou[6];
	
	//添加 方法
	public synchronized void push(ManTou wt) {
		//当满了的时候就停住
		while(index == arrWT.length) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//唤醒在此  对象监视器上  等待的所有线程
		this.notifyAll();		
		arrWT[index] = wt;
		index ++;
	}
	
	//取出方法
	public synchronized ManTou pop() {
		while(index == 0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//唤醒在此  对象监视器上  等待的所有线程
		this.notifyAll();
		index--;
		return arrWT[index];
	}
}
