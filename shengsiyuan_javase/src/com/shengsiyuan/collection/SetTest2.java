package com.shengsiyuan.collection;

import java.util.HashSet;

public class SetTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		/*
		 * 先判断和里面数据的hashcode值，如果没有相等的就加 
		 * 如果相等，判断equals 如果没有equals就加
		 * 不同地址 对应不同hashcode
		 */
		
		set.add(new People("zhangsan"));
		set.add(new People("z"));
		set.add(new People("zhangsan"));
		System.out.println(set);
		
		/*
		People p1 = new People("wangwu");
		People p2 = new People("wangwu");
		set.add(p1);
		set.add(p2);
		System.out.println(set);
		*/
		/*
		 * hashcode测试 
		People p1 = new People("wangwu");
		
		//hashcode()一次应用中 统一对象的hashc相同
		System.out.println(p1.hashCode());
		System.out.println(p1.hashCode());
		*/
	}

}

class People{
	String name;
	public People(String name){
		this.name=name;
	}
	
	
	
}