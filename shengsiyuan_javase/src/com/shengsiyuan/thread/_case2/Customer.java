package com.shengsiyuan.thread._case2;
//�������߳�
class Consumer implements Runnable {
	SyncStack ss = null;
	Consumer(SyncStack ss) {
		this.ss = ss;
	}
	
	public void run() {
		for(int i=0; i<20; i++) {
			ManTou wt = ss.pop();
			System.out.println("������: " + wt);
			try {
				Thread.sleep((int)(Math.random() * 1000));  //���� һ����Ϣ һ�������
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
	}
}