package com.shengsiyuan.jvm;

class Parent {
	static {
		System.out.println("���س�ʼ��");
	}
}

class Child extends Parent {
	static int b = 5;

	static {
		System.out.println("���౻��ʼ��");
		b=6;
	}
}

public class Test5 {
	static int c=10;
	static{
		System.out.println(c);
		System.out.println("�������ʼ��");
	}
	public static void main(String[] args) {
		System.out.println(Child.b);
	}
}
/*
 * ������1.���������࣬�����ӣ���ʼ��  ��ʼִ�о�̬�����  --�������ʼ��--
 * 		 2.����Child�ĸ��࣬��ʼ��ʱִ��  --b=5,�����ʼ��,b=6--
 * 		 3.�������ֵ
 */

