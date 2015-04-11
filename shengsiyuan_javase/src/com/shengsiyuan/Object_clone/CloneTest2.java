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
	
	//Object的clone方法可以对对象进行拷贝，但是需要在子类重写该方法调用父类clone方法 
	//因为object中方法为protected，只能被子类使用，所以包装下改变修饰
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();//对引用构造一个可复制当前对象的方法
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
//		Object objcet =super.clone();//调用Object方法，获得当前对象副本
//		return objcet;
		
		//深拷贝，对自己拷贝，然后拷贝后的对象里面的引用也进行拷贝，要在具体引用类里面实现该方法
		StudentN studentNCopy = (StudentN)super.clone();
		studentNCopy.setTeacher((Teacher)studentNCopy.getTeacher().clone());
		return studentNCopy;
	}
	
}