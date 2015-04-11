package com.shengsiyuan.serialize;

public class Consumer {

	public static void main(String[] args) {
		Person p = (Person)SerializationUtils.readObject();
		System.out.println("name="+p.getName());
	}
}
