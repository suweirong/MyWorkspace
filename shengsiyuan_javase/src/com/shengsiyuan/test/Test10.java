package com.shengsiyuan.test;

import java.util.HashMap;

public class Test10 {

	public static void main(String[] args) {
		//HashMap grade=new HashMap();
		HashMap<Integer,Integer> grade=new HashMap<Integer,Integer>();
	     grade.put(0,90);
	     grade.put(1,80);
	     grade.put(2,70);
	     grade.put(3,90);
	    int g=0;
	     for(int i=0;i<4;i++)
	    	 g+= grade.get(i);
	    	 System.out.println("����Ŀ�ĳɼ��ܷ�Ϊ��"+g);
	    	 System.out.println("ƽ����Ϊ��"+g/grade.size());
	}
}
