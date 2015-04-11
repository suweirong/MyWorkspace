package com.shengsiyuan.lesson2;

public class FinalTest1 {
	public static void main(String[] args) {
		GetInfo gf = new GetInfo();
		//info是final的，存储一个对象的地址，地址不能改变
		//gf.info=new Infomation();
		gf.info.name="123";//改变对象name的地址
	}
}

class Infomation{
	String name="zhongjian";
}

class GetInfo{
	final Infomation info=new Infomation();
}