package com.shengsiyuan.thread._case;

import java.util.ArrayList;

public class T {

	public static void main(String[] args) {
		ArrayList<ZT> list = new  ArrayList<ZT>();//һ�������࣬��һ�������������ã���ʵû��Ҫ��ֱ�����ڲ��������У����ﲻ���ڶ����Ҫͬһ������
		PutGet pg = new PutGet(list);//һ�������࣬�ж��ַ�������Ҫͬ�����໥����
		Thread pt = new PutThread(pg);//��ͬ�̳߳���ͬһ�����󣬵����䲻ͬ����
		Thread gt = new GetThread(pg);
		pt.start();
		gt.start();
	}
}
