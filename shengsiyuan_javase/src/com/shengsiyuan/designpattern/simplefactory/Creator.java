package com.shengsiyuan.designpattern.simplefactory;

public class Creator {

	public static Product createProduct(String str){
		if (str.equals("A")) {
			return new ConcreteProductA();
		}
		else if (str.equals("B")) {
			return new ConcreteProductB();
		}
		return null;
		
	}
}
