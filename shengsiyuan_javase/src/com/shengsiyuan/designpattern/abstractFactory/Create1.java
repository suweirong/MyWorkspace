package com.shengsiyuan.designpattern.abstractFactory;

public class Create1 extends CreateFather {

	/*
	 * ����1
	 * ��Ծ������
	 * ��һ�����࣬���տ�����һ�������������ø��෵�����ͣ���̬������࣬�����������趨
	 * 
	 */
	public static Abstract1 getCreate1(String str){
		if (str.equals("A")) {
			return new CreateAb1Create1();
		}
		else if(str.equals("B")) {
			return new CreateAb1Create2();
		}
		return null;
		}
	}
