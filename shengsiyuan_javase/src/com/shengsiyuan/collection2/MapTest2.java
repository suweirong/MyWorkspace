package com.shengsiyuan.collection2;

import java.util.HashMap;

public class MapTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//s1  �� s2��Ϊ������  Hashcode��ȡ�
		//ͨ��hashcode����λ�ã���λ��Ϊ�գ�ֱ�Ӽӵ���λ�õ�Entry�����С�
		//�ڶ����ӽ������ж�hashcode���ҵ�λ�á����������equals����== �µ�Entry����ȡ��ԭ��Entry����λ�á�
		//ͬʱ�ɵ�Entry����ӵ��µ�Entry������������
		String s1 = new String("1");
		String s2 = new String("1");
		System.out.println(s1.equals(s2));
		HashMap map = new HashMap();
		map.put(s1,"2");
		map.put(s2,"3");
		
	}

}
