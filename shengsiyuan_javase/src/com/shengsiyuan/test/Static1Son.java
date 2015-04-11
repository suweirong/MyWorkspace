package com.shengsiyuan.test;

public class Static1Son extends Static1 {
	public static  void test(){
		System.out.println("2");
	}
	public static void main(String[] args) {
		Static1 s1 = new Static1Son();
		s1.test();
		Static1Son s2 =(Static1Son)s1;
		s2.test();
	}
}
