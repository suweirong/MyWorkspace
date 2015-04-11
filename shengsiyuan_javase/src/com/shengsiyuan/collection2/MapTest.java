package com.shengsiyuan.collection2;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("1","2");
		map.put("1","3");
		map.put("2","3");
		map.put(new String("2"),"4");
		map.put(new String("2"),"5");
		System.out.println(map);
	}
}
