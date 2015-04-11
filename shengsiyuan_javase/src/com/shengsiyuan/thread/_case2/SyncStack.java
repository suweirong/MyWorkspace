package com.shengsiyuan.thread._case2;
/**
 * 
 * 
 * @author tramp
 *װ��ͷ������
 */

public class SyncStack {
	int index = 0;
	ManTou[] arrWT = new ManTou[6];
	
	//��� ����
	public synchronized void push(ManTou wt) {
		//�����˵�ʱ���ͣס
		while(index == arrWT.length) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//�����ڴ�  �����������  �ȴ��������߳�
		this.notifyAll();		
		arrWT[index] = wt;
		index ++;
	}
	
	//ȡ������
	public synchronized ManTou pop() {
		while(index == 0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//�����ڴ�  �����������  �ȴ��������߳�
		this.notifyAll();
		index--;
		return arrWT[index];
	}
}
