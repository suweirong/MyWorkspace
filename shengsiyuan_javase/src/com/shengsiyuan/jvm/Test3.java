package com.shengsiyuan.jvm;

class FinalTest3{
	
	public static final int a =6/3;//常量给了具体的值 称为编译时常量,不会初始化静态代码块
									//编译时就给出值
	static{
		System.out.println("FinalTest3 static block");
	}
	
}

public class Test3 {

	public static void main(String[] args) {
		System.out.println(FinalTest3.a);
	}
}
