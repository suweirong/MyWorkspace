package com.shengsiyuan.type;

public class CommonTypeLearn {

	// ����ֻ������һ������Ҫ��İ�װ ,�ײ㶼�Ƕ�����

	/*** ��int���ͱ����й� ****/
	byte a = 1;// ����intֵ,�������ͱ���,��byte��Χ�ڿ�ת
	short c = 1; // ����intֵ��short��Χ�ڿ�ת --���ͷ�Χ��ת
	// int aaa=1;
	// byte bbb =aaa;
	// byte b = 1111; //����intֵ����byte��Χ�ڲ���תint
	long e = 65535;// ������int��Χ�ڿ�ת��long --�����Զ�����ת
	// long f = 111111111111;������int��Χ��Ĳ����Զ�ת��ת��long
	long g = 111111111111L;// ������int��Χ��ļ�L����l����Ϊlong�ͱ���

	/**** java��ʾ���ͱ���������ʽ *******/
	int a1 = 1;
	int a2 = 07;// ������0��ͷ ��ʾ�˽�����ʽ����
	int a3 = 0x12;// ������0��x��ʾ16��������

	/***** �ַ���������ʽ *********/
	char ch1 = 'a';// ֱ��д����
	char ch2 = '\n';// ��б�ܼ�ĳ�ַ���ö�Ӧ������ֵ��char�ͱ�ʾ������Ʒ�
	char ch3 = '\u0000';// ֱ��unicode���ö�Ӧ������ֵ
	// char 16λ�޷��źŽ���,��Ӧ���������ݵ�ʮ���Ʒ�ΧΪ0-65535

	int chint = ch3;// int��ֱ�ӻ��char�Ķ�����ֵ,��ֵ��Χ��0-65535��
	char intch = 65535;// ��0��65535�����ͱ�����char,�ײ�λ����
	char intch1 = (char) 65536;// ������Χ��Ҫǿת,�ײ�����Ʋ�����,���ݶ�ʧ
	// string a =
	// "c:\a"java�з�б�������������;,�޷���÷�б�ܱ����Ӧ����������ȥʹ��,�ټӸ��ͻ�÷�б�ܱ������������,����б��

	/***** ������ *************/
	// ����ʾ������,ֻ�����Ͳ�һ��,���Ȳ�һ��
	float f1 = 1.1f;
	// float f2 =1.1;//Ĭ��double
	double d1 = 1.1d;
	double d2 = 1.1d;
	// ��ѧ��������ʾ������,�ײ㶼�Ƕ�����
	double d3 = 5.12e2;
	double d4 = 2e20;
	// BigDecimal bd =1.1;
	/****** �Զ�����ת�� *************/
	// (byte,short)|(char)-int-long-float-double
	// �����������Զ�����ת
	byte m = 1;// ͨ����������Χ���Զ�ת���byte
	short shorts = 1;
	char ca = 'a';
	int ia = 1;
	long la = 111111111111L;
	float ff = 1.0f;
	double dd = 1.0;

	public static void testInteger() {
		int i = 128;
		Integer i2 = 128;
		Integer i3 = new Integer(128);
		// Integer���Զ�����Ϊint������Ϊtrue
		System.out.println(i == i2);
		System.out.println(i == i3);
		System.out.println("**************");
		Integer i5 = 127;// java�ڱ����ʱ��,�������-> Integer i5 = Integer.valueOf(127);
		Integer i6 = 127;
		System.out.println(i5 == i6);// true
		/*
		Integer i5 = 128;
		Integer i6 = 128;
		System.out.println(i5 == i6);// false
		*/
		Integer ii5 = new Integer(127);
		System.out.println(i5 == ii5); // false
		Integer i7 = new Integer(128);
		Integer i8 = new Integer(123);
		System.out.println(i7 == i8); // false
	}

	// ����λ��ԭ��,������λ���Զ����λ����ת ,����������Ҫǿת,�������ߵ�ֵ��Χ��,���Ȼᶪʧ
	public static void main(String[] args) {
		int a2 = 017;
		int a3 = 0x12;// ������0��x��ʾ16��������
		long la = 1111111111111111111L;
		float ff = 1.0f;
		ff = la;// float���õı�ʾ��ʽ���ǻ���λ��,���Է�Χ�ǳ���
		System.out.println(5.12e3);
		double d4 = 2e20;
		System.out.println("d4:" + d4);
		System.out.println(a2);
		System.out.println(a3);
		testInteger();
	}
}
