package com.shengsiyuan.collection;

import java.util.HashSet;

public class OverTest {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		Student stu1=new Student("student1");
		Student stu2=new Student("student1");
		set.add(stu1);
		set.add(stu2);
		System.out.println(set);
	}
	
}

class Student{
	String name;
	//初始化 传变量  改变变量存储地址
	public Student(String name){
		this.name=name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}