package com.shengsiyuan.lesson8;

public class BoxTest2 {

	public static void main(String[] args) {
		
		//-128到127之间的Integer对象被创建时，会被缓存起来，新的变量还是指向该地址
		Integer i1 = 200;  //通过valueof方式将基本数据类型转换为一个Integer对象，根据数据值考虑是否放在缓存
		Integer i2 = 200;
		Integer i3 = 100;
		Integer i4 = 100;
		Integer i5 = new Integer(100);//new的话不会通过valueof过程 一定是个新的对象
		Integer i6 = new Integer(100);
		
		if (i1==i2) {
			System.out.println("i1==i2");
		}
		else {
			System.out.println("i1!=i2");
		}
		if (i3==i4) {
			System.out.println("i3==i4");
		}
		else {
			System.out.println("i3!=i4");
		}
		if (i5==i6) {
			System.out.println("i5==i6");
		}
		else {
			System.out.println("i5!=i6");
		}
	}
}
