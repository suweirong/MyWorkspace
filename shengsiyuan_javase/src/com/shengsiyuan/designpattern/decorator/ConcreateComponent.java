package com.shengsiyuan.designpattern.decorator;
/*
 * ���幹����ɫ
 * ����һ����Ҫ���ܸ������ε���
 * 
 */
public class ConcreateComponent implements ComponentInterface {

	@Override
	public void dothing() {

		System.out.println("����A");
	}

}
