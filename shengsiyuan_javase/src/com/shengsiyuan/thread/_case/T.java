package com.shengsiyuan.thread._case;

import java.util.ArrayList;

public class T {

	public static void main(String[] args) {
		ArrayList<ZT> list = new  ArrayList<ZT>();//一个集合类，被一个操作对象引用，其实没必要，直接在内部创建就行，这里不存在多个类要同一个对象
		PutGet pg = new PutGet(list);//一个操作类，有多种方法，需要同步，相互唤醒
		Thread pt = new PutThread(pg);//不同线程持有同一个对象，调用其不同方法
		Thread gt = new GetThread(pg);
		pt.start();
		gt.start();
	}
}
