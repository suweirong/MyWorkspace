package com.shengsiyuan.lesson1;
/*
 * 
 *  ����������ʾ�Ͳ���ֵ���� 
 *  ֵ��������Ի�����������
 *  һ���������͵ĵı����洢�������ݱ�����������ֵ
 *  ���ݵ�����ֵ�Ŀ��� 
 */
public class AdsValueTest {
	
	/*
	 * �÷����������ǽ����ⲿ��������ֵ ����������������ֵ�Ŀ��� 
	 * �����������ֵ���в��� 
	 */
	public	static void change( int i) {
		//�����в�������������ֵʱ����ı� 
		System.out.println(++i);
		i=2;
	}
	
	public static void main(String[] args) {
		int i =10;
		change(i);
		System.out.println(i);
	}
	
}
