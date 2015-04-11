package com.shengsiyuan.lesson5;

import java.util.ArrayList;

public class ArrayListTest3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
		list.add(new Integer(4));
		list.add(new Integer(5));
				
		//Integer[] t=(Integer[])list.toArray(); 错误 防止里面 内容非 该类型 
		Object[] t=list.toArray();
		for(int i=0;i<list.size();i++){
		System.out.println(((Integer)t[i]).intValue());	
		}
		
	}

}
