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
		Field field = privateType.getDeclaredField("name");//����������
//		Field field = privateType.getField("name");//�����public
		
		//���ÿɷ���Ȩ��   �ܶ��ܵĻ���
		//field.setAccessible(true);
		System.out.println(field.getName());
		field.set(test,"nihao");
		//System.out.println(test.getName());
	}

}
