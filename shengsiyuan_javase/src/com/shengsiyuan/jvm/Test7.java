package com.shengsiyuan.jvm;

class Parent7{
	
	static int a=10;
	
	static {
		System.out.println("Parents Static Block");
	}
	
	static void doThing(){
		System.out.println("dothing");
	}
	
}

class Child7 extends Parent7{
	
	static{
		System.out.println("Child Static Block");
	}

}



public class Test7 {

	public static void main(String[] args) {
		System.out.println(Child7.a);// ����û�иþ�̬��������������ʼ������
		Child7.doThing();
	}
}
