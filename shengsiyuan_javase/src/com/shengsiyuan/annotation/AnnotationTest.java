package com.shengsiyuan.annotation;

public @interface AnnotationTest {

//	String value();
	EnumTest value2();
	String value1() default "hello";
}

//枚举类型加入注解
enum EnumTest{
	Hello,World,Welcome;
}