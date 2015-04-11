package com.shengsiyuan.designpattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;


public class Client {

	public static void main(String[] args) {
		RealSubject realSubject = new RealSubject();//生成一个被代理对象
		
		InvocationHandler handler = new DynamicSubject(realSubject);//代理对象作为参数传递给动态代理类，代理类持有该对象
		
		Class<?> classType = handler.getClass();//获得动态代理类的Class对象，最终需要编译成
		
		//传递classloader,被代理接口,代理类对象
		Subject subject =(Subject)Proxy.newProxyInstance(classType.getClassLoader(),realSubject.getClass().getInterfaces(),handler);
		
		subject.request();
		System.out.println(subject.getClass());
	}
}
