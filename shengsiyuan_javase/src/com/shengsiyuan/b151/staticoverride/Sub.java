package com.shengsiyuan.b151.staticoverride;

public class Sub extends Base {

	
	public static void doSomething(){
		System.out.println("我是子类静态方法");
	}
	
	@Override
	public void doAnything(){
		System.out.println("我是子类非静态方法");
	}
}
