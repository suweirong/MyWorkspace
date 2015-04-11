package com.shengsiyuan.lesson8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ForTest {

	public static void main(String[] args) {
		int a[] ={1,2,3,4,5};
		for(int i:a){
			System.out.println(i);
		}
		//多维数组for循环
		String string [][]={{"1","2","3"},{"2","3","k"},{"k","s","j"}};
		for(String[] s:string ){//针对行
			for(String element:s){//针对元素 
				System.out.print(element+" ");
			}
		}
		
		//遍历集合
		Collection<String> collection = new ArrayList<String>();
		collection.add("a");
		collection.add("d");
		collection.add("k");
		System.out.println();
		for(String i:collection){
			System.out.println(i);
		
		}
		System.out.println("----------------遍历集合的多种方式-----------");
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println("No.1---普通for语句");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		System.out.println("No.2---迭代器");
		for(Iterator iterator = list.iterator();iterator.hasNext();){
			System.out.println(iterator.next());
		}
		
		System.out.println("No3---增强for循环");
		for(String string2:list){
			System.out.println(string2);
		}
		
		System.out.println("旧式访问各个下标");
		
		
		
		
	}
}
