package com.shengsiyuan.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*
 * 定义一个注解
 */

//限定该注解后面使用后与class关系，取关系
@Retention(RetentionPolicy.RUNTIME)  //要想读取该注解信息，那么Retention的值需为RUNTIME
//@Retention(RetentionPolicy.CLASS)//该注解信息不能被读到VM中，反射方式也就访问不到这些信息
//@Retention(RetentionPolicy.SOURCE)  
public @interface MyAnnotation {

	String hello() default "shengsiyuan";
	String world();
}
