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
		//1.������class����ͨ��Class��������ʵ�� 
		Class<?> classtype =InvokeTest.class;//��ø�class����
		Object invokeTest = classtype.newInstance();//ͨ�������class�����ø���ʵ��
		//ͨ��Class���󣬻��Method����ͨ��Method���� ���÷���
		Method addMethod = classtype.getMethod("add",new Class[]{int.class,int.class});//ͨ��class�����getMethodָ��������������
		Object result = addMethod.invoke(invokeTest,new Object[]{1,2});
		System.out.println((Integer)(result));
		//���Class���󣬺;���ʵ����Ȼ����÷���  Class�������ڻ��Method�ԣ�ʵ�����ڵ��÷���
		Method echoMethod = classtype.getMethod("echo",new Class[]{String.class});
		Object echoResult = echoMethod.invoke(invokeTest,new Object[]{"�ҿ�"});
		System.out.println(echoResult);
	}

}
