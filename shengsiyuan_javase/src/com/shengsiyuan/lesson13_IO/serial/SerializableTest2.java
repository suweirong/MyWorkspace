package com.shengsiyuan.lesson13_IO.serial;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.swing.text.html.InlineView;

public class SerializableTest2 {
	 //对象数据读取到内存和写入文件  包装下 加关键字

	public static void main(String[] args) throws Exception {
		Person2 p1 = new Person2(20,"zhangsan",1.75);
		Person2 p2 = new Person2(21,"lisi",1.76);
		Person2 p3 = new Person2(22,"wangwu",1.78);
		
		FileOutputStream fos = new FileOutputStream("Person2.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.writeObject(p3);
		oos.close();
		
		System.out.println("--------------------");
		
		FileInputStream fis = new FileInputStream(new File("Person2.txt"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		Person2 person =null;
		for(int i=0;i<3;i++){
			person = (Person2)ois.readObject();
			System.out.println(person.age+person.name+person.height);		}
		
	}
}

class Person2 implements Serializable{
	int age;
	
	transient	String name;//让你不能序列化
	
	double height;
	
	public Person2(int age,String name,double height){
		this.age = age;
		this.name=name;
		this.height=height;

	}
	 private void writeObject(java.io.ObjectOutputStream out)
     throws IOException{
		 out.writeInt(age);
		 out.writeUTF(name);
		 System.out.println("write object");
		 
	 }
 private void readObject(java.io.ObjectInputStream in)
     throws IOException, ClassNotFoundException{
	 age = in.readInt();
	 name = in.readUTF();
	 System.out.println("read Object");
 }

	
	
	
	
}