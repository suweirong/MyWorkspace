package com.shengsiyuan.jdk5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapTest2 {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("a","aa");
		map.put("b","bb");
		map.put("c","cc");
		Set<Map.Entry<String,String>> set2 = map.entrySet();
		for(Iterator iterator = set2.iterator();iterator.hasNext();){
			Map.Entry<String,String> mapEntry = (Entry<String, String>) iterator.next();
			String key = mapEntry.getKey();
			String value = mapEntry.getValue();
			System.out.println("key:"+key+","+"value:"+value);
		}
	}
}
