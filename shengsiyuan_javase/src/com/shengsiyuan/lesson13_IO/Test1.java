package com.shengsiyuan.lesson13_IO;

public class Test1 {
	
//	public static int jiechen(int a){
//		int result = a;
//		for(int i=1;i<a;a--){
//			result=result*(a-1);
//		}
//		return result;
//	}
//	public static int jiechen(int a){
//		int result = 1;
//		for(int i=a;0<a;a--){
//			result=result*i;
//		}
//		return result;
//	}
	public static int jiechen(int a){
		int result=a;
		if (result!=1) {
		return	result=a*jiechen(a-1);
		}
		else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Test1.jiechen(4));
	}
}
