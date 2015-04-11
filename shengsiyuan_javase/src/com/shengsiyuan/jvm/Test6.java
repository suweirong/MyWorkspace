package com.shengsiyuan.jvm;

class Parent2{
	static int a=4;
	static{
		System.out.println("Parent");
	}
}

class Child2 extends Parent2{
	static int b = 5;
	static{
		System.out.println("����2");
	}
}
class Child3 extends Parent2{
	static int b = 5;
	static{
		System.out.println("����3");
	}
}

public class Test6 {
	public static void main(String[] args) {
		Parent2 p2;
		System.out.println("------------------");
		p2 = new Parent2();
		System.out.println(Parent2.a);
		System.out.println(Child2.b);
		System.out.println(Child3.b);
	}
}
/*
 *���Ԥ�ƣ�
 *		   1.---------------
 *		   2.Parent
 *		   3.4
 *		   4.����
 * 		   5.5
 * 
 * 		�����Ѿ������س�ʼ���Ͳ����ٴγ�ʼ��
 *
 *
 *
 */



