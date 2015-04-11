package com.shengsiyuan.type;

public class CommonTypeLearn {

	// 类型只是满足一种运算要求的包装 ,底层都是二进制

	/*** 与int整型变量有关 ****/
	byte a = 1;// 整型int值,不是整型变量,在byte范围内可转
	short c = 1; // 整型int值在short范围内可转 --整型范围内转
	// int aaa=1;
	// byte bbb =aaa;
	// byte b = 1111; //整型int值不在byte范围内不可转int
	long e = 65535;// 整型在int范围内可转到long --类型自动向上转
	// long f = 111111111111;整型在int范围外的不可自动转换转到long
	long g = 111111111111L;// 整型在int范围外的加L或者l设置为long型变量

	/**** java表示整型变量三种形式 *******/
	int a1 = 1;
	int a2 = 07;// 以数字0开头 表示八进制形式数据
	int a3 = 0x12;// 以数字0加x表示16进制数据

	/***** 字符型三种形式 *********/
	char ch1 = 'a';// 直接写符号
	char ch2 = '\n';// 反斜杠加某字符获得对应二进制值加char型表示特殊控制符
	char ch3 = '\u0000';// 直接unicode码获得对应二进制值
	// char 16位无符号号解释,对应二进制数据的十进制范围为0-65535

	int chint = ch3;// int可直接获得char的二进制值,该值范围在0-65535内
	char intch = 65535;// 把0到65535内整型变量给char,底层位够存
	char intch1 = (char) 65536;// 超出范围就要强转,底层二进制不够存,数据丢失
	// string a =
	// "c:\a"java中反斜杠有特殊解析用途,无法获得反斜杠本身对应二进制数据去使用,再加个就获得反斜杠本身二进制数据,或正斜杠

	/***** 浮点型 *************/
	// 都表示浮点数,只是类型不一样,精度不一样
	float f1 = 1.1f;
	// float f2 =1.1;//默认double
	double d1 = 1.1d;
	double d2 = 1.1d;
	// 科学技术法表示该数据,底层都是二进制
	double d3 = 5.12e2;
	double d4 = 2e20;
	// BigDecimal bd =1.1;
	/****** 自动类型转换 *************/
	// (byte,short)|(char)-int-long-float-double
	// 该类型数据自动向右转
	byte m = 1;// 通过整型量范围内自动转获得byte
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
		// Integer会自动拆箱为int，所以为true
		System.out.println(i == i2);
		System.out.println(i == i3);
		System.out.println("**************");
		Integer i5 = 127;// java在编译的时候,被翻译成-> Integer i5 = Integer.valueOf(127);
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

	// 由于位数原因,所以少位可自动向多位数据转 ,从右向左需要强转,如果在左边的值范围外,精度会丢失
	public static void main(String[] args) {
		int a2 = 017;
		int a3 = 0x12;// 以数字0加x表示16进制数据
		long la = 1111111111111111111L;
		float ff = 1.0f;
		ff = la;// float采用的表示方式不是基于位数,所以范围非常大
		System.out.println(5.12e3);
		double d4 = 2e20;
		System.out.println("d4:" + d4);
		System.out.println(a2);
		System.out.println(a3);
		testInteger();
	}
}
