package com.shengsiyuan.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsTest {
	/*
	 * ������ 
	 * ַ���ݸı䣬�Զ������ݽ��е��� 
	 * �޲η·𷵻�ĳ�ֶ���
	 * 
	 */
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(new Integer(-8));
		list.add(new Integer(20));
		list.add(new Integer(-20));
		list.add(new Integer(8));
		//ͨ��Collections�����������
		//Collectionsͨ���Լ��·𷵻��������
		Comparator r = Collections.reverseOrder();
		//��Ա��趨������򣬽�list��Ϊ��������ȥ 
		Collections.sort(list,r);
		for(Iterator iterator=list.iterator();iterator.hasNext();){
			System.out.println(iterator.next());
		}
		System.out.println();
		//���������ݴ������
		Collections.shuffle(list);
		for(Iterator iterator=list.iterator();iterator.hasNext();){
			System.out.println(iterator.next());
		}
		System.out.println("Minimum value:"+Collections.min(list));
		System.out.println("Max value:"+Collections.max(list));
		
	}
}
