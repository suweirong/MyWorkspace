package com.shengsiyuan.jvm;

class FinalTest3{
	
	public static final int a =6/3;//�������˾����ֵ ��Ϊ����ʱ����,�����ʼ����̬�����
									//����ʱ�͸���ֵ
	static{
		System.out.println("FinalTest3 static block");
	}
	
}

public class Test3 {

	public static void main(String[] args) {
		System.out.println(FinalTest3.a);
	}
}
