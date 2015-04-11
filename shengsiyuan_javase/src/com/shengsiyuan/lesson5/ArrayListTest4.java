package com.shengsiyuan.lesson5;

import java.util.ArrayList;

public class ArrayListTest4 {

	/**
	 * @
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(new Point(1,2));
		list.add(new Point(3,4));
		list.add(new Point(5,6));
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		System.out.println(list);
	}
}

