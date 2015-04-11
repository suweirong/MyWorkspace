package com.shengsiyuan.Object_clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.shengsiyuan.lesson13_IO.ByteOutputStream.ByteOutputTest;

public class CopySerial {

}

class Teac implements Serializable{
	private int age;
	private String name;
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



class Stu implements Serializable{
	private int age;
	private String name;
	private Teac teadcher;
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
	public Teac getTeadcher() {
		return teadcher;
	}
	public void setTeadcher(Teac teadcher) {
		this.teadcher = teadcher;
	}
	
	/*
	 * clone方法不能对所有引用完成深复制
	 * 通过序列化对刘的写读操作完成一个深复制
	 */
	public Object deepCopy() throws Exception{
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();
		
	}
}


