package com.shengsiyuan.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class T {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		p1.setId("1");
		p2.setId("2");
		p3.setId("3");
		p4.setId("4");
		p1.setName("张三 10岁");
		p2.setName("李四   101岁");
		p3.setName("王五 12岁");
		p4.setName("胡六 118岁");
		p1.setAge(10);
		p2.setAge(101);
		p3.setAge(12);
		p4.setAge(118);
		List<String> list = new ArrayList<String>();
//		list.add(p1);
//		list.add(p2);
//		list.add(p3);
//		list.add(p4);
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		Comparator rComparator = Collections.reverseOrder();
		Collections.sort(list,rComparator);
//		Collections.sort(list,new MyListComparator());
		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));
	}
}
