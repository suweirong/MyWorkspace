package com.shengsiyuan.lesson8;

import java.util.ArrayList;
import java.util.List;

public class BoxTest {

	public static void main(String[] args) {
		List<Integer> integer = new ArrayList<Integer>();
		integer.add(1);//�޶������͵ģ����ǿ���ֱ�Ӽӻ����������ͣ��ײ�ת����Integer
		integer.add(2);
		integer.add(3);
		for(Integer i:integer){
			System.out.println(i);//�����ʱ�򣬻��Զ���Integerת��Ϊint���
		}
	}
}
