package com.shengsiyuan.jdk5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	/*
	 *  ���ͽ������������Ͳ�����
	 *  �����޶��ò������ͣ��趨�÷�������ת��
	 *  set
	 *  getʱ�Զ����ظ���ָ������ת���������
	 *  
	 *  
	 *  ���û�з��ͣ�һ����ֻ�ܴ���ĳ�̶ֹ����͵�
	 *  ���ǲ����趨Ϊһ��Object����
	 *  �����ʱ���ɶ�̬�Գ���
	 *  �������ȡ��ʱ����Ҫ�趨ΪObject���ͣ����С���Ϊ��֪������ľ�������
	 *  ʹ��ʱ������Ҫǿ��ת����������������ʹ�ö������з�������
	 */
	public static void main(String[] args) {
		List<String> arrList = new ArrayList<String>();
		arrList.add("aaa");
		arrList.add("bbb");
		arrList.add("ccc");
		arrList.add("ddd");
		arrList.add("eee");
//		for (int i = 0; i < arrList.size(); i++) {
//			System.out.println(arrList.get(i));
//		}
//		
		for(Iterator<String> iterator=arrList.iterator();iterator.hasNext();){
			System.out.println(iterator.next());
		}
	}
}
