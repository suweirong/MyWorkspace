package com.shengsiyuan.lesson5;

import java.util.LinkedList;

public class LinkedListTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		list.add("M");//�������󣬼�������
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		//linkedlist���з���
		list.addLast("Z");
		list.addFirst("A");
		list.add(1,"A2");
		System.out.println("����ļ���:"+list);
		
		list.remove(2);
		list.remove("E");
		System.out.println("�仯��ļ���:"+list);
		
		Object object = list.get(2);
		list.set(2,(String)object+"changed");
		System.out.println("�޸ĺ�ļ���:"+list);
	}

}
