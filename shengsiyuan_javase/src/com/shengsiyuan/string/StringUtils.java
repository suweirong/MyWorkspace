package com.shengsiyuan.string;

public class StringUtils {

	
	public static int strToInt(String str){
		int a = Integer.parseInt(str);
		return a;
	}
	
	public static void test(){
		char a ='1';
		int b =(int)a;
		System.out.println(b);
	}

	public static void main(String[] args) {
		
//		System.out.println(StringUtils.strToInt("12345"));
		test();
	}
}
