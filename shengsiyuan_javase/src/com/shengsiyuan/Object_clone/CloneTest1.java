package com.shengsiyuan.Object_clone;

public class CloneTest1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student student1 = new Student();
		student1.setAge(10);
		student1.setName("zhangsan");
		Student student2 =(Student)student1.clone();
		System.out.println(student2.getAge());
		System.out.println(student2.getName());
		System.out.println("--------------------");
		student2.setAge(11);
		System.out.println(student1.getAge());
		System.out.println(student2.getAge());
	}
}

class Student implements Cloneable{
	int age;
	String name;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object object = super.clone();
		return object;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}