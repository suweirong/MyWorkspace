package com.shengsiyuan.lesson8;

public class TestVararg {
	//����һ���ɱ����
	public static void sum(int...mul){
		// ����һ������ʹ������
		int sum = 0;
		for(int it:mul){
			sum+=it;
		}
		System.out.println(sum);
	}
	
	public static void sum1(String string,int...mul){
		String string2 =string;
		int sum = 0;
		for(int it:mul){
			sum+=it;
		}
		System.out.println(string2+"="+sum);
	}
	
	public static void main(String[] args) {
		TestVararg.sum(1,2,3);
		TestVararg.sum(1,0,3);
		TestVararg.sum1("��",1,2,3,4);
	}
	
}
