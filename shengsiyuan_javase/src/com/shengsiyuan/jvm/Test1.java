package com.shengsiyuan.jvm;

import java.util.Random;

public class Test1 {

	/*
	 * �ɾ�̬�����ĵ������𣬼��أ�׼����Ĭ��ֵ����ʼ���ϵ��³�ʼ��
	 */
	private static Test1 test1 = new Test1();//��̬�������غ������ִ��׼������ʼ��������ʵ��
//	private static int count1;
//	private static int  count2=0;
	private  int count1=10;
	private  int  count2=0;  //�������ֻ��׼���׶κͷ����ڸı�ֵ����������̬���������ٴγ�ʼ��
	private  int count3=new Random().nextInt(100);
	private static int count4 =10;
	private Test1(){
		count1++;
		count2++;
	}
	
	
	static{
		System.out.println("Static��ʼ����");
	}
	{
		System.out.println("��ʼ����");//׼���׶�
		System.out.println(count1);
		System.out.println(count3);
		System.out.println(test1);
		System.out.println(count4);
	}
	public static Test1 getInstance(){
		return test1;
	}
	public static void main(String[] args) {
		Test1 t1Test1 = Test1.getInstance();
//		System.out.println(t1Test1.count1);
//		//System.exit(0);
//		System.out.println(t1Test1.count2);
	}
}

