package com.shengsiyuan.jvm;

class CL{
	static{
		System.out.println("CL Static Block");
	}
}

public class Test8 {

	public static void main(String[] args) throws ClassNotFoundException {
		ClassLoader clLoader = ClassLoader.getSystemClassLoader();
		Class<?> clzz = clLoader.loadClass("com.shengsiyuan.jvm.CL");
		System.out.println("---------------------------");
		Class clazz1 = Class.forName("com.shengsiyuan.jvm.CL");
	}
	
}
