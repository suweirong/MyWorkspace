package com.shengsiyuan.jdk5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	/*
	 *  泛型将类中数据类型参数化
	 *  类中限定好参数类型，设定好返回类型转换
	 *  set
	 *  get时自动返回根据指定类型转换后的类型
	 *  
	 *  
	 *  如果没有泛型，一个类只能处理某种固定类型的
	 *  除非参数设定为一个Object类型
	 *  传入的时候由多态性成立
	 *  类语句中取出时，需要设定为Object类型，才行。因为不知道传入的具体类型
	 *  使用时，还需要强制转换回来，才能真正使用对象特有方法特性
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
