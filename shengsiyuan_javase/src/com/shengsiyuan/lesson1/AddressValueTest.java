package com.shengsiyuan.lesson1;

public class AddressValueTest {

	/**
	 * @param args
	 * ֵ���ݺ�ַ���� 
	 * ��������ָ��Ķ��󲻻ᱻ�ı�  �������͵�ֵ����ı�
	 * �������͵����Ի�ı䣡�����������¾������� ������
	 * 
	 */
	String s1 = new String("asaa");
	int a =10;
	/*	
	public void changed(AddressValueTest aTest,int i){
		aTest.s1="changed";
		i=11;
		
	}
	 */
	public void changed(String a,int i){
		a="changed";
		i=11;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressValueTest ad = new AddressValueTest();
		//ad.changed(ad,ad.a);
		ad.changed(ad.s1,ad.a);
		System.out.println(ad.s1+","+ad.a); 
	}

}
