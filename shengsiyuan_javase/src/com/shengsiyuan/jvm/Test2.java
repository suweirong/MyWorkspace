package com.shengsiyuan.jvm;

public class Test2 {

	public static void main(String[] args) throws ClassNotFoundException {
		Class cs1 = Class.forName("java.lang.String");//���ض�Ӧclass���� 
		System.out.println(cs1.getClassLoader());
		Class cs2 = Class.forName("com.shengsiyuan.jvm.c");
		System.out.println(cs2.getClassLoader());
	}
}

class c{
	
}