package com.shengsiyuan.collection2;

import java.util.HashMap;
import java.util.Map;

public class MapTest3 {
/*
 * String��hashCode��ȣ�equalsҲ��ȡ�
 * ���Կ���hashcode��equals��Ⱥ󣬿��Լӵ���Ӧλ��
 * ���ڲ���hashcode���equals�����ʱ���
 * 
 */
	public static void main(String[] args) {
//		HashMap<PersonA, String> map = new HashMap<PersonA, String>();
//		PersonA p1 = new PersonA("A");
//		PersonA p2 = new PersonA("A");
////		System.out.println(p1.hashCode());
////		System.out.println(p2.hashCode());
//		System.out.println(p1.equals(p2));
//		map.put(p1,"1");
//		map.put(p2,"2");
//		System.out.println(map.get(p1));
//		System.out.println(map.get(p2));
		Map map = new HashMap();
		map.put("1","2");
		map.put("1","3");
		System.out.println(map);
	}
}


class PersonA{
	String name;
	@Override
	public int hashCode() {
		return 1;
	}

	
	public PersonA(String name) {
		this.name=name;
	}
	public boolean equals(PersonA obj) {
		// TODO Auto-generated method stub
		return this.name==obj.name;
	}
	
}