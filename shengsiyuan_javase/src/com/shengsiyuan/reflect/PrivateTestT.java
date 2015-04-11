package com.shengsiyuan.reflect;

import java.lang.reflect.Field;

public class PrivateTestT {

	/**
	 * @param args
	 * @throws NoSuchFieldException 
	 * @throws SecurityException 
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 */
	public static void main(String[] args) throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		PrivateTest test = new PrivateTest();
		Class<?> privateType = test.getClass();
		Field field = privateType.getDeclaredField("name");//所有声明的
//		Field field = privateType.getField("name");//仅针对public
		
		//设置可访问权限   很多框架的基础
		//field.setAccessible(true);
		System.out.println(field.getName());
		field.set(test,"nihao");
		//System.out.println(test.getName());
	}

}
