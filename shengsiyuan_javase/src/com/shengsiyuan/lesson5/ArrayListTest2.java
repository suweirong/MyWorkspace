package com.shengsiyuan.lesson5;

import java.util.ArrayList;

public class ArrayListTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list= new ArrayList();
//		//加字符串 和整型
//		list.add("add");
//		list.add(new Integer(1));
//		//list.add(1); 错误  只能放置对象 不能放置原生数据类型 
//		
//		String str = (String)list.get(0);//返回的是Object 所以必须在向下转型 
//		Integer t = (Integer)list.get(1);//只能转向原有对象类型 
//		System.out.println(str);
//		System.out.println(t.intValue());
		list.add(new Integer(1));//原生数据包装 
		list.add(new Integer(2));
		list.add(new Integer(3));
		list.add(new Integer(4));
		list.add(new Integer(5));
		int sum=0;
		for(int i=0;i<list.size();i++){
		sum+=((Integer)list.get(i)).intValue();
		}
		System.out.println(sum);
	
	}

}
