package com.shengsiyuan.lesson8;

public class TestVararg {
	//接收一个可变参数
	public static void sum(int...mul){
		// 定义一个变量使用数据
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
		TestVararg.sum1("和",1,2,3,4);
	}
	
}
