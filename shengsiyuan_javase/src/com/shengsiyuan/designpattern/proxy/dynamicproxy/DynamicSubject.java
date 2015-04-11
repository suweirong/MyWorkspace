package com.shengsiyuan.designpattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/*
 * 
 * ��̬���������󣬶�ָ̬������
 */
public class DynamicSubject implements InvocationHandler {

	private  Object sub;
	
	public DynamicSubject(Object obj){
		this.sub = obj;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("Before Calling:" + method);
		
		method.invoke(sub,args);//��̬method����,��̬ʾ������̬����
		
		System.out.println("After Calling:"+method);
		
		return null;
	}

}
