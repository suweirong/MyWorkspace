package com.shengsiyuan.collection;

import java.util.HashSet;

public class SetTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		/*
		 * ���жϺ��������ݵ�hashcodeֵ�����û����ȵľͼ� 
		 * �����ȣ��ж�equals ���û��equals�ͼ�
		 * ��ͬ��ַ ��Ӧ��ͬhashcode
		 */
		
		set.add(new People("zhangsan"));
		set.add(new People("z"));
		set.add(new People("zhangsan"));
		System.out.println(set);
		
		/*
		People p1 = new People("wangwu");
		People p2 = new People("wangwu");
		set.add(p1);
		set.add(p2);
		System.out.println(set);
		*/
		/*
		 * hashcode���� 
		People p1 = new People("wangwu");
		
		//hashcode()һ��Ӧ���� ͳһ�����hashc��ͬ
		System.out.println(p1.hashCode());
		System.out.println(p1.hashCode());
		*/
	}

}

class People{
	String name;
	public People(String name){
		this.name=name;
	}
	
	
	
}