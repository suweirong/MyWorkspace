package com.shengsiyuan.designpattern.abstractFactory;

public class AbstractFactory {

	/*
	 * 抽象工厂，返回不同工厂，通过多态，让工厂继承一个父类
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
