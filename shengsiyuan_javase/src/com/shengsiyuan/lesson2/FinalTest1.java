package com.shengsiyuan.lesson2;

public class FinalTest1 {
	public static void main(String[] args) {
		GetInfo gf = new GetInfo();
		//info��final�ģ��洢һ������ĵ�ַ����ַ���ܸı�
		//gf.info=new Infomation();
		gf.info.name="123";//�ı����name�ĵ�ַ
	}
}

class Infomation{
	String name="zhongjian";
}

class GetInfo{
	final Infomation info=new Infomation();
}