package com.shengsiyuan.collection2;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		Person p1 = new Person(1);
		Person p2 = new Person(1);
		System.out.println(p1==p2);
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p1==p1);
		System.out.println(p1.equals(p1));
		System.out.println(p1.equals(p2));
	}
}

class Person{
	int name;
	public Person(int name) {
		this.name = name;
	}
	public int hashCode(){
		return 1;
		
	}
	public boolean equals(Person obj) {
		return this.name==obj.name;
	}
}