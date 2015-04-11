package com.shengsiyuan.reflect;

import java.lang.reflect.Array;

public class ArrayTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] dims = new int[]{15,10,15};
		Object array = Array.newInstance(Integer.TYPE,dims);//array是个三维数组 
		Object arrayobj = Array.get(array,3);//arrayobj是二维数组
		Class<?> cls = arrayobj.getClass().getComponentType();
		arrayobj=Array.get(arrayobj,5);//此时arrayObj是一维数组
		Array.set(arrayobj,10,37);
		int[][][] arrayCast = (int[][][])array;
		System.out.println(arrayCast[3][5][10]);
	}

}
