package com.shengsiyuan.thread._case2;
//�������߳�
class Producer implements Runnable {
	SyncStack ss = null;
	Producer(SyncStack ss) {
		this.ss = ss;
	}
	
	public void run() {
		for(int i=0; i<20; i++) {
			ManTou wt = new ManTou(i);
			ss.push(wt);
				System.out.println("�����ˣ�" + wt);
			try {
				Thread.sleep((int)(Math.random() * 200));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
	}
}