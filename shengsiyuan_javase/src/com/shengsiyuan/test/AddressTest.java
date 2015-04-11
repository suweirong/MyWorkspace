package com.shengsiyuan.test;

public class AddressTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressTest ad = new AddressTest();
		String s1="321";
		int a[]=new int[3];
		ad.test(s1,a);
		System.out.println(s1+","+a[0]);
		System.out.println(1+3+"nihao"+1+3);
		System.out.println(10/0.0);
	}
	/*
	public  void test(AddressTest ad){
		ad.s1="123";
	}
	*/
	public void test(String s,int c[]){
		System.out.println(s);
		s="123";
		c[0]=111;
	}

}
