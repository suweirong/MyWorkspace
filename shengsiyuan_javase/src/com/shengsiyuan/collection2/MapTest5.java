package com.shengsiyuan.collection2;

import java.util.HashMap;
import java.util.Map;

public class MapTest5 {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(null,"122");
		System.out.println(map.get(null));
	}
}
