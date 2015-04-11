package com.shengsiyuan.collection2;

import java.util.HashMap;

public class MapTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Comparable, String> map = new HashMap<Comparable, String>();
		map.put("a","zhangsan");
		map.put("b","lisi");
		map.put("c","wangwu");
		map.put("c","liudehua");
		map.put(1,"s");
		map.put(2, "3");
		map.put(2, "4");
		
		System.out.println(map);
		//由key获得value
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		//无key返回null 
		System.out.println(map.get(3));
		//获得map中key信息
		System.out.println(map.keySet());
	}

}
