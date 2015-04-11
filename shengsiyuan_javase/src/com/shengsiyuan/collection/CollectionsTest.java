package com.shengsiyuan.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsTest {
	/*
	 * 核心是 
	 * 址传递改变，对对象数据进行调整 
	 * 无参仿佛返回某种对象
	 * 
	 */
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(new Integer(-8));
		list.add(new Integer(20));
		list.add(new Integer(-20));
		list.add(new Integer(8));
		//通过Collections返回排序规则
		//Collections通过自己仿佛返回排序规则
		Comparator r = Collections.reverseOrder();
		//针对表设定排序规则，将list做为参数传进去 
		Collections.sort(list,r);
		for(Iterator iterator=list.iterator();iterator.hasNext();){
			System.out.println(iterator.next());
		}
		System.out.println();
		//将表中数据打乱输出
		Collections.shuffle(list);
		for(Iterator iterator=list.iterator();iterator.hasNext();){
			System.out.println(iterator.next());
		}
		System.out.println("Minimum value:"+Collections.min(list));
		System.out.println("Max value:"+Collections.max(list));
		
	}
}
