package com.shengsiyuan.lesson5;

import java.util.LinkedList;

public class LinkedListTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		list.add("M");//创建对象，加入引用
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		//linkedlist特有方法
		list.addLast("Z");
		list.addFirst("A");
		list.add(1,"A2");
		System.out.println("最初的集合:"+list);
		
		list.remove(2);
		list.remove("E");
		System.out.println("变化后的集合:"+list);
		
		Object object = list.get(2);
		list.set(2,(String)object+"changed");
		System.out.println("修改后的集合:"+list);
	}

}
