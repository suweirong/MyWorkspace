package com.shengsiyuan.designpattern.Strategy;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int result;
		//��ʼ�����ʵ�ֶ���
		Environment environment = new Environment(new Sub());
		result	= environment.caculate(1,2);
		System.out.println(result);
		//��̬���ó��ж���
		environment.setCaculate(new Add());
		result	= environment.caculate(11,20);
		System.out.println(result);
		
	}

}
