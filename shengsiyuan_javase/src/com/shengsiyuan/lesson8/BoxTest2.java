package com.shengsiyuan.lesson8;

public class BoxTest2 {

	public static void main(String[] args) {
		
		//-128��127֮���Integer���󱻴���ʱ���ᱻ�����������µı�������ָ��õ�ַ
		Integer i1 = 200;  //ͨ��valueof��ʽ��������������ת��Ϊһ��Integer���󣬸�������ֵ�����Ƿ���ڻ���
		Integer i2 = 200;
		Integer i3 = 100;
		Integer i4 = 100;
		Integer i5 = new Integer(100);//new�Ļ�����ͨ��valueof���� һ���Ǹ��µĶ���
		Integer i6 = new Integer(100);
		
		if (i1==i2) {
			System.out.println("i1==i2");
		}
		else {
			System.out.println("i1!=i2");
		}
		if (i3==i4) {
			System.out.println("i3==i4");
		}
		else {
			System.out.println("i3!=i4");
		}
		if (i5==i6) {
			System.out.println("i5==i6");
		}
		else {
			System.out.println("i5!=i6");
		}
	}
}
