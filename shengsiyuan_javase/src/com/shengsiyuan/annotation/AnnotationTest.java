package com.shengsiyuan.annotation;

public @interface AnnotationTest {

//	String value();
	EnumTest value2();
	String value1() default "hello";
}

//ö�����ͼ���ע��
enum EnumTest{
	Hello,World,Welcome;
}