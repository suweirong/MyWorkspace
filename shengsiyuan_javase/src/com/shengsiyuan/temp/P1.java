package com.shengsiyuan.temp;

public class P1 {

//	public P1() {
//		System.out.println("Parent");
//	}
//	public P1(){
//		System.out.println("Parent");
//	}
	public P1(String str){//�вι��췽������ʧȥ��Ĭ�Ϲ��췽������Ҫ�Ļ�������ʾ����
		System.out.println(str);
	}
	public P1(String s1,String s2){
		System.out.println(s1+s2);
	}
	public static void main(String[] args) {
		C1 cla = new C1("1","2");
		System.out.println();
	}
	
}

class C1 extends P1{
	static String s3="12";
	public C1(){
		super(s3);
		String s2 = "j";
	}
	public C1(String s1,String s2){
//		super(s1,s2);
//		System.out.println(s1+s2);
		super(s1);
		System.out.println(s1+s2);
	}

}