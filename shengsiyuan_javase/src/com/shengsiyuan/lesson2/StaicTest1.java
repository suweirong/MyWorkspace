package com.shengsiyuan.lesson2;

/*
 * 
 * static 方法可以直接.调用，不能被覆盖
 */
public class StaicTest1 {
	public static void test(){
		System.out.println("1");
	}
	public static void main(String[] args) {
		StaicTest1.test();
		StaticTest2.test();
	}
	
}

class StaticTest2 extends StaicTest1{
	public static void test(){
		System.out.println("2");
	}

	
}