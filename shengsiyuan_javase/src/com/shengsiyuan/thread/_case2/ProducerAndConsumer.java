package com.shengsiyuan.thread._case2;
/**
 * ���� �����ߺ�����������
 * 
 **/
public class ProducerAndConsumer {
	public static void main(String[] args) {
		
		SyncStack ss = new SyncStack();
		
		//һ��������
		Producer p = new Producer(ss);
		//һ��������
		Consumer c = new Consumer(ss);
		
		new Thread(p).start();
		new Thread(c).start();
	}
}

