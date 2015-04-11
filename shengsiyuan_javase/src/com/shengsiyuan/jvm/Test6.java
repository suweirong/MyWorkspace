package com.shengsiyuan.jvm;

class Parent2{
	static int a=4;
	static{
		System.out.println("Parent");
	}
}

class Child2 extends Parent2{
	static int b = 5;
	static{
		System.out.println("子类2");
	}
}
class Child3 extends Parent2{
	static int b = 5;
	static{
		System.out.println("子类3");
	}
}

public class Test6 {
	public static void main(String[] args) {
		Parent2 p2;
		System.out.println("------------------");
		p2 = new Parent2();
		System.out.println(Parent2.a);
		System.out.println(Child2.b);
		System.out.println(Child3.b);
	}
}
/*
 *输出预计：
 *		   1.---------------
 *		   2.Parent
 *		   3.4
 *		   4.子类
 * 		   5.5
 * 
 * 		父类已经被加载初始化就不会再次初始化
 *
 *
 *
 */



