package com.shengsiyuan.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EntryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		map.put("a","aaa");
		map.put("b","bbb");
		map.put("c","ccc");
		map.put("d","ddd");
		map.put("e","eee");
		
		Set set = map.entrySet();//对象是Map.Entry类型的
		for(Iterator iterator = set.iterator();iterator.hasNext();){
			Map.Entry entry = (Map.Entry)iterator.next();//向下转型使用Map.entry类特有方法，可以直接通过方法获得key 和 value  keyset只能获得key
			String key = (String)entry.getKey();
			String value = (String)entry.getValue();
			System.out.println(key+":"+value);
		}
	}

}
