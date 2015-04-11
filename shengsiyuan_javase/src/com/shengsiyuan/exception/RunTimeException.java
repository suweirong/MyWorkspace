package com.shengsiyuan.exception;

public class RunTimeException {

	public static void main(String[] args) {
		int [] a = new int[2];
		System.out.println(a[3]);//底层有程序判断到，然后抛出异常
	}
	
}
