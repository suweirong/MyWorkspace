package com.shengsiyuan.lesson5;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arrayList=new ArrayList();
		arrayList.add("121");
		arrayList.add("122");
		arrayList.add("123");
		arrayList.add("123");//���ظ� 	
		Iterator iterator = arrayList.iterator();
		while(iterator.hasNext()){
			System.out.println("���ɵ���������"+iterator.next());
		}
		String s1=(String)arrayList.get(0);//����object ǿ��ת������ 
		String s2=(String)arrayList.get(1);
		String s3=(String)arrayList.get(2);
		String s4=(String)arrayList.get(3);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println("-------------------");
		for(int i=0;i<arrayList.size();i++){//size()��ȡԪ�ظ��� 
				System.out.println(arrayList.get(i));
			
		}
		
		/*
		 arrayList.clear();
		System.out.println("�������");
		System.out.println(arrayList.isEmpty());
		*/
		arrayList.remove(1);
		for(int i=0;i<arrayList.size();i++){//size()��ȡԪ�ظ��� 
			System.out.println(arrayList.get(i));
		}
		arrayList.remove("123");
		arrayList.add("321");
		arrayList.add("321");
		System.out.println(arrayList.indexOf("321"));//find the first object's location 
	}

}
