package com.shengsiyuan.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeTest3 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet(new MyComparator());
		set.add("C");
		set.add("D");
		set.add("B");
		set.add("E");
		set.add("A");
		set.add("F");
		for(Iterator iterator=set.iterator();iterator.hasNext();){
					String str=	(String)iterator.next();
					System.out.println(str);
		}
	}
}


class MyComparator implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1=(String)o1;
		String s2 =(String)o2;  
		return s2.compareTo(s1);
	}
}