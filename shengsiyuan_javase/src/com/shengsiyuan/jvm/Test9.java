package com.shengsiyuan.jvm;

public class Test9 {
	public static void main(String[] args) {
		A a1 =new A();
	}
}

class A{
	String a = "123";
	

	public A() {
		String b = "234";
		System.out.println(b);
		System.out.println(a);
	}
}