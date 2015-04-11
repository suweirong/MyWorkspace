package com.shengsiyuan.collection;

import java.util.HashSet;

public class SetTest {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		/*
		System.out.println(set.add("b"));
		set.add("c");
		set.add("d");
		set.add("e");
		System.out.println(set.add(new String("b")));
		//打印结果无序
		System.out.println(set);
		*/
		set.add("a");
		set.add("a");
		System.out.println(set);
	}

}


