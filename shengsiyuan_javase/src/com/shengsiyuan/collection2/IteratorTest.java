package com.shengsiyuan.collection2;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			HashSet set = new HashSet();
			set.add("a");
			set.add("b");
			set.add("c");
			set.add("d");
			set.add("e");
			//System.out.println(set);//һ�������������
			
			//ʹ��Itrator
			Iterator iterator = set.iterator();
			while(iterator.hasNext()){
				System.out.println(iterator.next());
			}
			
	}

}
