package com.shengsiyuan.exception.runorder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test5 {

	public static void main(String[] args)  {
		Exc3 exc1 = new Exc3();
		exc1.m1();
		exc1.m2();
	}
	
}
/*
 * �������Test3,Test4���Ƚϣ�try catch ��ֻ�ǽ���Ĭ�϶�ջ��ӡ�ĺ��
 * ���try catch�󣬽���Ĭ�϶�ջ��ӡ����ֱ���׳�ȥ��һ���ģ��������ֹ
 * ��������Ĭ������£���Ҫ�������������Լ��Ĵ�������������Ϊ��������Ƶ�
 * 
 * ������throws���õ����߽����Լ�������������
 * 
 * ���һ��throws�����գ���ô�����������������д�ӡ������Ϣ����������ֹ
 * û�ﵽ���checkedException�����Ĵ���
 * 
 */
class  Exc3{
	
	public void m1() {

			FileInputStream fileInputStream=null;
			try {
				fileInputStream = new FileInputStream("ax.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("δ�ҵ�Դ�ļ�");
//				e.printStackTrace();
			}
			try {
				fileInputStream.read();//һ��δ������쳣��������ֹ
										//ǰ��Ļ���������쳣�����������ָ�룬��������ʱ�쳣�����򲻻���ʾ�����������������ֹ
										//��ȷ�Ĵ���ʽ��
			} catch (Exception e) {
				// TODO Auto-generated catch block
//				System.out.println("�ļ��޷���ȡ");
				e.printStackTrace();
			}


		
	}
	public void m2(){
		System.out.println("�׳���ִ��");
	}
	
	
}