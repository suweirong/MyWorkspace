package com.shengsiyuan.exception.myexception;

public class MyTest1 {

	public void method(String str) throws MyException{
		if(str==null){
			throw new MyException("����Ĳ���Ϊ��");//�����Ԥ�Ⲣ������Ӧ��������������һ����Ӧ��checkedexception�쳣����
		}							   //��ʹ�õ�ʱ�����try catch ʹ�ó���ָ�
		else {
			System.out.println(str);
		}
	}
	public	void method1(){
		System.out.println("�ڶ�������");
	}
	
	public static void main(String[] args) {
		MyTest1 m1 = new MyTest1();
		try {
			m1.method(null);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m1.method1();
	}
}
