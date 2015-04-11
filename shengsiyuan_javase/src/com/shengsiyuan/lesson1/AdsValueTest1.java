package com.shengsiyuan.lesson1;

public class AdsValueTest1 {

	/**
	 * 该类用于演示引用数据类型的地址传递
	 * 通过地址指向对象，改变地址可以改变改变变量值 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[3];
		change(a);
		System.out.println(a[0]);
	}
	/*
	 * 数组是对象，引用类型变量指向对象，引用类型变量间传递的是地址 
	 * 变量通过地址控制地中中的数据内容
	 * 
	 * 
	 */
	public static void change(int b[]){
		b[0]=1;
	}

}
