package com.shengsiyuan.reflect;

import java.lang.reflect.Method;

public class DumpMethods {

	/**
	 * �������н���һ���ַ�������ĳ��������
	 * ��ӡ���������з�������
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class<?> classtype= Class.forName(args[0]);//����ַ���ָ�����Class����
		Method[] methos = classtype.getDeclaredMethods();
		for (Method method : methos) {
			System.out.println(method);
		}
	}

}
