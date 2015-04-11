package com.shengsiyuan.designpattern.Singleton;

public class Singleton2 {

	//类加载的时候就产生对象
	//无论几个线程调用getInstance都是调用已经生成的实例
	private static Singleton2 singleton = new Singleton2();
	
	private Singleton2() {
		// TODO Auto-generated constructor stub
	}
	
	public static Singleton2 getInstance(){
		return singleton;
	}
	
	
}
