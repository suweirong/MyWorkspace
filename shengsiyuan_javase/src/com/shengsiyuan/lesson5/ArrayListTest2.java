package com.shengsiyuan.lesson5;

import java.util.ArrayList;

public class ArrayListTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list= new ArrayList();
//		//���ַ��� ������
//		list.add("add");
//		list.add(new Integer(1));
//		//list.add(1); ����  ֻ�ܷ��ö��� ���ܷ���ԭ���������� 
//		
//		String str = (String)list.get(0);//���ص���Object ���Ա���������ת�� 
//		Integer t = (Integer)list.get(1);//ֻ��ת��ԭ�ж������� 
//		System.out.println(str);
//		System.out.println(t.intValue());
		list.add(new Integer(1));//ԭ�����ݰ�װ 
		list.add(new Integer(2));
		list.add(new Integer(3));
		list.add(new Integer(4));
		list.add(new Integer(5));
		int sum=0;
		for(int i=0;i<list.size();i++){
		sum+=((Integer)list.get(i)).intValue();
		}
		System.out.println(sum);
	
	}

}
