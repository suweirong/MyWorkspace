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
		
		Set set = map.entrySet();//������Map.Entry���͵�
		for(Iterator iterator = set.iterator();iterator.hasNext();){
			Map.Entry entry = (Map.Entry)iterator.next();//����ת��ʹ��Map.entry�����з���������ֱ��ͨ���������key �� value  keysetֻ�ܻ��key
			String key = (String)entry.getKey();
			String value = (String)entry.getValue();
			System.out.println(key+":"+value);
		}
	}

}
