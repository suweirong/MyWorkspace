package com.shengsiyuan.annotation;

@MyAnnotation(hello="aaa",world="ccc")
public class MyTest {
	
	@Deprecated
	@MyAnnotation(hello="dd",world="sss")
	@SuppressWarnings("unchecked")
	public void outPut(){
		System.out.println("out put somethig");
	}
}
