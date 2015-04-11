package com.shengsiyuan.thread._case2;
/**
 * 经典 消费者和生产者问题
 * 
 **/
public class ProducerAndConsumer {
	public static void main(String[] args) {
		
		SyncStack ss = new SyncStack();
		
		//一个生产者
		Producer p = new Producer(ss);
		//一个消费者
		Consumer c = new Consumer(ss);
		
		new Thread(p).start();
		new Thread(c).start();
	}
}

