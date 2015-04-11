package com.shengsiyuan.designpattern.abstractFactory;

public class Create2  extends CreateFather{

	/*
	 * 工厂1
	 * 针对具体对象
	 */
	public static Abstract2 getCreate1(String str){
		if (str.equals("A")) {
			return new CreateAb2Create1();
		}
		else if(str.equals("B")) {
			return new CreateAb2Create2();
		}
		return null;
		}
	}
