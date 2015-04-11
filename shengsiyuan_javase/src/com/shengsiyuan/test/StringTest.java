package com.shengsiyuan.test;

import java.util.HashMap;

public class StringTest {

	public static void main(String[] args) {
//		String s1 = new String("1");
//		String s2 = new String("1");
//		String s4 = "1";
//		String s5 = "1";
//		String s3 = new String("2");
//		System.out.println(s4.hashCode());	
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		System.out.println(s3.hashCode());
//		System.out.println(s1==s2);
//		System.out.println(s1==s3);
//		System.out.println(s2==s3);
//		System.out.println(s5==s4);
//		System.out.println(s1.equals(s2));
		//以下测试区
		/***测试证明如果要替代另一个元素，HashCode相等是第一，第二内容相等或者地址相等***/
		//性质1：自己写的类，每new一个对象，就有不同HashCode。
		//性质2：HashCode相等是替代的前提，equals或者==也是替代的前提
		//结论1：要想自己写的类有相同成员变量的对象去替代另一对象，重写HashCode，
		//		相同成员变量对象的HashCode相等  同时重写equals，相同成员变量的equals相等
		Person p1 = new Person("1");
		Person p2 = new Person("1");
		HashMap map = new HashMap();
		map.put(p1,"1");
		map.put(p2,"2");
		System.out.println(map.get(p1));
		System.out.println(map.get(p2));
	}
}
class Person{
	String name;
	public Person(String name) {
		this.name = name;
	}
	
}
