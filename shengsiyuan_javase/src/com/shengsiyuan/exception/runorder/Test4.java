package com.shengsiyuan.exception.runorder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test4 {

	public static void main(String[] args)  {
		Exc2 exc1 = new Exc2();
		exc1.m1();
		exc1.m2();
	}
	
}
/*
 * �������Test3���Ƚϣ��Ƚ�һֱthrows������try catch������
 * try catch������Ե�ǰ�����������������ǻָ�����������client������Ӧ�Ļָ�������ʵ�ֻظ� �Ĺ���
 * 
 * ������throws���õ����߽����Լ�������������
 * 
 * ���һ��throws�����գ���ô�����������������д�ӡ������Ϣ����������ֹ
 * û�ﵽ���checkedException�����Ĵ���
 * 
 */
class  Exc2{
	
	public void m1() {
		try {
			FileInputStream fileInputStream = new FileInputStream("ax.txt");
			fileInputStream.read();
		} catch (Exception e) {
//			System.out.println("δ�ҵ��ļ��������Ƿ��ж�ȡԴ�ļ�");
//			e.printStackTrace();
		}

		
	}
	public void m2(){
		System.out.println("�����ָ�ִ��");
	}
	
	
}