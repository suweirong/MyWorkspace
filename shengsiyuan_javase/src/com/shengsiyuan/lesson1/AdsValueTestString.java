package com.shengsiyuan.lesson1;

public class AdsValueTestString {

	/**
	 * @param args
	 * ������ֵ�����ô�ַ
	 * String���󲻿ɸı䣬ֻ�и��ı�����ַ 
	 * ����ͨ������������ȡ����������ֵ����ȡ�������͵�ַȥ��ȡ��ֵ��ı���ֵ
	 * String���ͳ��⣬ֻ�ܻ�ȡ��ֵ����ͨ���޸ı�����ַָ���¶���ı������ָ����ֵ
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("asdfg");
		change(s1);
		System.out.println(s1);
		

	}
	/*
	 * ͨ��������ֱ�������������һ����ͬ���Ͷ���ĵ�ַ
	 * Ȼ����в�������ȡֵ������������
	 * 
	 * String���ͱ��� ����Ƕ���ĵ�ַ 
	 *  �����о������ֵ��final���͵���������洢�޷��ı�
	 *  ����ֻ��ͨ���ı�String�����洢�ĵ�ַȥ�ı��������� 
	 *  ÿһ�θ�String���ͱ�����ֵ�����Ǹı����洢�ĵ�ַ 
	 */
	public static void change(String s2){
		System.out.println(s2);
		s2="��������ַ��";
		System.out.println(s2);//����µ�ַָ������е����� 
		
	}
}
