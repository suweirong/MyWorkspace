package com.shengsiyuan.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTester {

	/**
	 * @param args
	 * @throws Exception 
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws SecurityException 
	 * @throws IllegalArgumentException 
	 */
	public Object  copy(Object object) throws Exception{
		//ͨ��������Class����
		Class<?> classtype = object.getClass();
		//ͨ��Class�������ָ�����췽����ö�����ָ�����ͣ���ָ������ֵ  �ֱ� new Class  new Object
		Object classcopy = classtype.getConstructor(new Class[]{}).newInstance(new Object[]{});
		//�����������
		Field fields[] = classtype.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			String fieldName = field.getName();//ͨ��field������������
			String firstLetter = fieldName.substring(0,1).toUpperCase();
			//���set������
			String setName = "set"+firstLetter+fieldName.substring(1);
			//���get������
			String getName = "get"+firstLetter+fieldName.substring(1);
			
			//��÷�������ʼͨ��class�����þ��巽����Method����
			Method setMethod = classtype.getMethod(setName,new Class[]{field.getType()});
			
			Method getMethod = classtype.getMethod(getName,new Class[]{});
			//���Method���������Method�������ָ������Classʵ������ķ���
			Object getValue = getMethod.invoke(object,new Object[]{});
			System.out.println(fieldName+":"+getValue);
			setMethod.invoke(classcopy,new Object[]{getValue});
		}
		return classcopy;
	}
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.setA(3);
		customer.setB(22222222222222222l);
		customer.setC("Hello ����");
		Customer customer2 = (Customer)new ReflectTester().copy(customer);
		System.out.println(customer2.getA()+":"+customer2.getB()+":"+customer2.getC());
	}

}

class Customer{
	
	private int a;
	
	private long b;
	
	private String c;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public long getB() {
		return b;
	}

	public void setB(long b) {
		this.b = b;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}
	
	
}
