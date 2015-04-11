package com.shengsiyuan.designpattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;


public class Client {

	public static void main(String[] args) {
		RealSubject realSubject = new RealSubject();//����һ�����������
		
		InvocationHandler handler = new DynamicSubject(realSubject);//���������Ϊ�������ݸ���̬�����࣬��������иö���
		
		Class<?> classType = handler.getClass();//��ö�̬�������Class����������Ҫ�����
		
		//����classloader,������ӿ�,���������
		Subject subject =(Subject)Proxy.newProxyInstance(classType.getClassLoader(),realSubject.getClass().getInterfaces(),handler);
		
		subject.request();
		System.out.println(subject.getClass());
	}
}
