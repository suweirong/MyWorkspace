package com.shengsiyuan.annotation;

import java.util.Date;

public class DeprecatedTest {
	//������ʹ��
	@Deprecated
	public void doSthing(){
		System.out.println("do thing");
	}
	
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toLocaleString());
//		System.out.println(new DeprecatedTest().doSthing());
	}
}
