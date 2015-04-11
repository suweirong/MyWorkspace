package com.shengsiyuan.jdk5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("a","aa");
		map.put("b","bb");
		map.put("c","cc");
		Set<String> set =map.keySet();
		for(Iterator<String> iterator = set.iterator();iterator.hasNext(); ){
			String key = iterator.next();
			String value = map.get(key);
			System.out.println(value);
		}
	}
}
