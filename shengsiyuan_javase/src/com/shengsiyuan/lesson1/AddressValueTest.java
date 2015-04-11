package com.shengsiyuan.lesson1;

public class AddressValueTest {

	/**
	 * @param args
	 * 值传递和址传递 
	 * 引用类型指向的对象不会被改变  基本类型的值不会改变
	 * 引用类型的属性会改变！！！！！以下就是例子 ！！！
	 * 
	 */
	String s1 = new String("asaa");
	int a =10;
	/*	
	public void changed(AddressValueTest aTest,int i){
		aTest.s1="changed";
		i=11;
		
	}
	 */
	public void changed(String a,int i){
		a="changed";
		i=11;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressValueTest ad = new AddressValueTest();
		//ad.changed(ad,ad.a);
		ad.changed(ad.s1,ad.a);
		System.out.println(ad.s1+","+ad.a); 
	}

}
