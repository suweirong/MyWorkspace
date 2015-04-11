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
		//通过对象获得Class对象
		Class<?> classtype = object.getClass();
		//通过Class对象调用指定构造方法获得对象，先指定类型，再指定具体值  分别 new Class  new Object
		Object classcopy = classtype.getConstructor(new Class[]{}).newInstance(new Object[]{});
		//获得所有属性
		Field fields[] = classtype.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			String fieldName = field.getName();//通过field对象获得属性名
			String firstLetter = fieldName.substring(0,1).toUpperCase();
			//获得set方法名
			String setName = "set"+firstLetter+fieldName.substring(1);
			//获得get方法名
			String getName = "get"+firstLetter+fieldName.substring(1);
			
			//获得方法名后开始通过class对象获得具体方法的Method对象
			Method setMethod = classtype.getMethod(setName,new Class[]{field.getType()});
			
			Method getMethod = classtype.getMethod(getName,new Class[]{});
			//获得Method对象后，再有Method对象调用指定所属Class实例对象的方法
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
		customer.setC("Hello 反射");
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
