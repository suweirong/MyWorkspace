package com.shengsiyuan.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.naming.spi.DirStateFactory.Result;

public class InvokeTest {

	/**
	 * @param args
	 */
	public int add(int param1,int param2){
		return param1+param2;
	}
	
	public String echo(String msg){
		return "hello:"+msg;
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//1.获得类的class对象，通过Class对象生成实例 
		Class<?> classtype =InvokeTest.class;//获得该class对象
		Object invokeTest = classtype.newInstance();//通过该类的class对象获得该类实例
		//通过Class对象，获得Method对象，通过Method对象 调用方法
		Method addMethod = classtype.getMethod("add",new Class[]{int.class,int.class});//通过class对象的getMethod指定方法名，参数
		Object result = addMethod.invoke(invokeTest,new Object[]{1,2});
		System.out.println((Integer)(result));
		//获得Class对象，和具体实例，然后调用方法  Class对象用于获得Method对，实例用于调用方法
		Method echoMethod = classtype.getMethod("echo",new Class[]{String.class});
		Object echoResult = echoMethod.invoke(invokeTest,new Object[]{"我靠"});
		System.out.println(echoResult);
	}

}
