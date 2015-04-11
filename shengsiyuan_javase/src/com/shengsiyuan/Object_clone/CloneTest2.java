package com.shengsiyuan.Object_clone;

public class CloneTest2 {

	public static void main(String[] args) throws CloneNotSupportedException {
		StudentN studentN = new StudentN();
		studentN.setAge(11);
		studentN.setName("Student zhang");
		Teacher teacher = new Teacher();
		teacher.setAge(30);
		teacher.setName("Teacher Zhang");
		studentN.setTeacher(teacher);
	
		StudentN studentN2 = (StudentN)studentN.clone();
		System.out.println(studentN2.getName());
		
	}
}

class Teacher implements Cloneable{
	
	int age;
	String name;
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
	
	//Object��clone�������ԶԶ�����п�����������Ҫ��������д�÷������ø���clone���� 
	//��Ϊobject�з���Ϊprotected��ֻ�ܱ�����ʹ�ã����԰�װ�¸ı�����
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();//�����ù���һ���ɸ��Ƶ�ǰ����ķ���
	}
}

class StudentN implements Cloneable{
	
	int age;
	String name;
	private Teacher teacher;
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
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
//		Object objcet =super.clone();//����Object��������õ�ǰ���󸱱�
//		return objcet;
		
		//��������Լ�������Ȼ�󿽱���Ķ������������Ҳ���п�����Ҫ�ھ�������������ʵ�ָ÷���
		StudentN studentNCopy = (StudentN)super.clone();
		studentNCopy.setTeacher((Teacher)studentNCopy.getTeacher().clone());
		return studentNCopy;
	}
	
}