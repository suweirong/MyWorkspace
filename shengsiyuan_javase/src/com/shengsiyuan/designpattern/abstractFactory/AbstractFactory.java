package com.shengsiyuan.designpattern.abstractFactory;

public class AbstractFactory {

	/*
	 * ���󹤳������ز�ͬ������ͨ����̬���ù����̳�һ������
	 */
	
	public static CreateFather getFactory(String str){
		if(str.equals("1")){
			return new Create1();
		}
		else if(str.equals("2")){
			return new Create2();
		}
		return null;
		
	}
}
