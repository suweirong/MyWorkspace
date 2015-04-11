package com.shengsiyuan.annotation;

public class AnnotationUsage {
//	@AnnotationTest(value="a")
//	@AnnotationTest(value1="a", value="")
	@AnnotationTest(value2=EnumTest.Hello)
//xx@AnnotationTest("",value1="a")
	public void test(){
		System.out.println("Test");
	}
	
	public static void main(String[] args) {
		AnnotationUsage us = new AnnotationUsage();
		us.test();
	}
}
