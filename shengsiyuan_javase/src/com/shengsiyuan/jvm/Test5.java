package com.shengsiyuan.jvm;

class Parent {
	static {
		System.out.println("加载初始化");
	}
}

class Child extends Parent {
	static int b = 5;

	static {
		System.out.println("子类被初始化");
		b=6;
	}
}

public class Test5 {
	static int c=10;
	static{
		System.out.println(c);
		System.out.println("启动类初始化");
	}
	public static void main(String[] args) {
		System.out.println(Child.b);
	}
}
/*
 * 分析：1.加载启动类，，连接，初始化  开始执行静态代码块  --启动类初始化--
 * 		 2.加载Child的父类，初始化时执行  --b=5,子类初始化,b=6--
 * 		 3.输出子类值
 */

