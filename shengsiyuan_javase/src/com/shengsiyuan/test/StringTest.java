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
		//���²�����
		/***����֤�����Ҫ�����һ��Ԫ�أ�HashCode����ǵ�һ���ڶ�������Ȼ��ߵ�ַ���***/
		//����1���Լ�д���࣬ÿnewһ�����󣬾��в�ͬHashCode��
		//����2��HashCode����������ǰ�ᣬequals����==Ҳ�������ǰ��
		//����1��Ҫ���Լ�д��������ͬ��Ա�����Ķ���ȥ�����һ������дHashCode��
		//		��ͬ��Ա���������HashCode���  ͬʱ��дequals����ͬ��Ա������equals���
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
