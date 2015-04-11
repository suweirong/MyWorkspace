package com.shengsiyuan.reflect;

import java.lang.reflect.Array;

public class ArrayTest {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class<?> classtype = Class.forName("java.lang.String");
		Object array = Array.newInstance(classtype,10);
		Array.set(array,2,"Hello Array!");
		String string = (String) Array.get(array,2);
		System.out.println(string);
	}

}
