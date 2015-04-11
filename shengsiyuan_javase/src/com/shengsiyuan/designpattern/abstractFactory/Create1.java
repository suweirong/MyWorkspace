package com.shengsiyuan.designpattern.abstractFactory;

public class Create1 extends CreateFather {

	/*
	 * 工厂1
	 * 针对具体对象
	 * 有一个父类，最终可以在一个方法里面设置父类返回类型，动态获得子类，父类根据情况设定
	 * 
	 */
	public static Abstract1 getCreate1(String str){
		if (str.equals("A")) {
			return new CreateAb1Create1();
		}
		else if(str.equals("B")) {
			return new CreateAb1Create2();
		}
		return null;
		}
	}
