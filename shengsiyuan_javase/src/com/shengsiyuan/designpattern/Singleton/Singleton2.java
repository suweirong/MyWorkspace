package com.shengsiyuan.designpattern.Singleton;

public class Singleton2 {

	//����ص�ʱ��Ͳ�������
	//���ۼ����̵߳���getInstance���ǵ����Ѿ����ɵ�ʵ��
	private static Singleton2 singleton = new Singleton2();
	
	private Singleton2() {
		// TODO Auto-generated constructor stub
	}
	
	public static Singleton2 getInstance(){
		return singleton;
	}
	
	
}
