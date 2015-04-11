package com.shengsiyuan.lesson1;

public class AdsValueTestString {

	/**
	 * @param args
	 * 基本传值，引用传址
	 * String对象不可改变，只有更改变量地址 
	 * 可以通过方法参数获取基本类型数值，获取引用类型地址去获取数值或改变数值
	 * String类型除外，只能获取数值，或通过修改变量地址指向新对象改变变量的指向数值
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("asdfg");
		change(s1);
		System.out.println(s1);
		

	}
	/*
	 * 通过变量或直接生产对象接受一个相同类型对象的地址
	 * 然后进行操作，获取值用于其他操作
	 * 
	 * String类型变量 存的是对象的地址 
	 *  对象中具体的数值又final类型的数组变量存储无法改变
	 *  所以只能通过改变String变量存储的地址去改变它的内容 
	 *  每一次给String类型变量赋值，都是改变它存储的地址 
	 */
	public static void change(String s2){
		System.out.println(s2);
		s2="参数换地址了";
		System.out.println(s2);//输出新地址指向对象中的数据 
		
	}
}
