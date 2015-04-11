package com.shengsiyuan.designpattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/*
 * 
 * 动态代理具体对象，动态指定方法
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
		
		method.invoke(sub,args);//动态method对象,动态示例，动态参数
		
		System.out.println("After Calling:"+method);
		
		return null;
	}

}
