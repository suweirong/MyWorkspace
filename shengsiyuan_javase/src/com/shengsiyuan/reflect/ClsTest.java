package com.shengsiyuan.reflect;

import java.awt.Button;

public class ClsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button b = new Button();
		
		Class<?> c1 = b.getClass();
	
		System.out.println(c1);
		
		Class<?> c2 = c1.getSuperclass();
		
		System.out.println(c2);
		
		Class<?> c3 = c2.getSuperclass();
		
		System.out.println(c3);
		
		Class<?> c4 = c3.getSuperclass();
		
		System.out.println(c4);
		
		//Integer.TYPE == int.class
	}

}
