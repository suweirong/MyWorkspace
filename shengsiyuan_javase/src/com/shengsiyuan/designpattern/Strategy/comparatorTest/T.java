package com.shengsiyuan.designpattern.Strategy.comparatorTest;

import java.util.TreeSet;

public class T {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		p1.setId("1");
		p2.setId("2");
		p3.setId("3");
		p4.setId("4");
		
		p1.setAge(1);
		p2.setAge(2);
		p3.setAge(3);
		p4.setAge(4);
		
		p1.setName("张三");
		p2.setName("李四");
		p3.setName("王五");
		p4.setName("胡六");
		
		TreeSet<Person> set = new TreeSet<Person>(new MyComparator());
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		System.out.println(set);
	}
}
