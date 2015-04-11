package com.shengsiyuan.collection2;

import java.util.HashMap;

public class MapTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//s1  和 s2作为键对象  Hashcode相等。
		//通过hashcode计算位置，该位置为空，直接加到该位置的Entry对象中。
		//第二个加进来，判断hashcode，找到位置。如果键对象equals或者== 新的Entry对象取代原有Entry对象位置。
		//同时旧的Entry对象加到新的Entry对象后面的链上
		String s1 = new String("1");
		String s2 = new String("1");
		System.out.println(s1.equals(s2));
		HashMap map = new HashMap();
		map.put(s1,"2");
		map.put(s2,"3");
		
	}

}
