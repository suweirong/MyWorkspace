package com.shengsiyuan.exception.runorder;

public class Test2 {
	
	public static void main(String[] args) {
		
		try {
			int a=0;
			int b=2;
			int c=0;
			System.out.println(b/c);//�����쳣���׳���������
			System.out.println("���鷽���ڲ�����");
		} catch (Exception e) {
			System.out.println("�׳���һ���쳣");//�������������һ������
		}

		
		System.out.println("�쳣���ֶ��������");
		
	}
	
	
	
}
