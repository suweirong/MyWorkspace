package com.shengsiyuan.lesson2;

/*
 * 
 * static ��������ֱ��.���ã����ܱ�����
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