package com.shengsiyuan.lesson13_IO.serial;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableTest1 {
	 //对象数据读取到内存和写入文件  包装下 加关键字

	public static void main(String[] args) throws Exception {
		Person p1 = new Person(20,"zhangsan",1.75);
		Person p2 = new Person(21,"lisi",1.76);
		Person p3 = new Person(22,"wangwu",1.78);
		
		FileOutputStream fos = new FileOutputStream("Person.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.writeObject(p3);
		oos.close();
		
		System.out.println("--------------------");
		
		FileInputStream fis = new FileInputStream(new File("Person.txt"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		Person person =null;
		for(int i=0;i<3;i++){
			person = (Person)ois.readObject();
			System.out.println(person.age+person.name+person.height);		}
		
	}
}

class Person implements Serializable{
	int age;
	
	transient	String name;//让你不能序列化 无法存储  返回的时候是空
	
	double height;
	
	public Person(int age,String name,double height){
		this.age = age;
		this.name=name;
		this.height=height;

	}
	
	
	
	
	
}