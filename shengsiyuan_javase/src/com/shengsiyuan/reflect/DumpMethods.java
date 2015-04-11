package com.shengsiyuan.reflect;

import java.lang.reflect.Method;

public class DumpMethods {

	/**
	 * 从命令行接受一个字符串（是某个类名）
	 * 打印出该类所有方法声明
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class<?> classtype= Class.forName(args[0]);//获得字符串指向类的Class对象
		Method[] methos = classtype.getDeclaredMethods();
		for (Method method : methos) {
			System.out.println(method);
		}
	}

}
