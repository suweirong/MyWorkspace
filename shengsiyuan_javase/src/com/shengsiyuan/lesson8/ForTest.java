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
		//��ά����forѭ��
		String string [][]={{"1","2","3"},{"2","3","k"},{"k","s","j"}};
		for(String[] s:string ){//�����
			for(String element:s){//���Ԫ�� 
				System.out.print(element+" ");
			}
		}
		
		//��������
		Collection<String> collection = new ArrayList<String>();
		collection.add("a");
		collection.add("d");
		collection.add("k");
		System.out.println();
		for(String i:collection){
			System.out.println(i);
		
		}
		System.out.println("----------------�������ϵĶ��ַ�ʽ-----------");
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println("No.1---��ͨfor���");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		System.out.println("No.2---������");
		for(Iterator iterator = list.iterator();iterator.hasNext();){
			System.out.println(iterator.next());
		}
		
		System.out.println("No3---��ǿforѭ��");
		for(String string2:list){
			System.out.println(string2);
		}
		
		System.out.println("��ʽ���ʸ����±�");
		
		
		
		
	}
}
