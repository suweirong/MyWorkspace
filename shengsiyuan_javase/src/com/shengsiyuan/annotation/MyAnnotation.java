package com.shengsiyuan.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*
 * ����һ��ע��
 */

//�޶���ע�����ʹ�ú���class��ϵ��ȡ��ϵ
@Retention(RetentionPolicy.RUNTIME)  //Ҫ���ȡ��ע����Ϣ����ôRetention��ֵ��ΪRUNTIME
//@Retention(RetentionPolicy.CLASS)//��ע����Ϣ���ܱ�����VM�У����䷽ʽҲ�ͷ��ʲ�����Щ��Ϣ
//@Retention(RetentionPolicy.SOURCE)  
public @interface MyAnnotation {

	String hello() default "shengsiyuan";
	String world();
}
