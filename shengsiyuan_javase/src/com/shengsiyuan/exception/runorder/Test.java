package com.shengsiyuan.exception.runorder;

public class Test {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.input(3);
		System.out.println("Pass");
	}

}

class Test1{
	
	public void input(int a){
		if (a==1) {
			System.out.println(a);
		}
//		else	if (a==2) {
//			System.out.println(a);
//		}	
//		try {
//			
			System.out.println(1/0);
//		} catch (Exception e) {
//			System.out.println("³ý´í");
//		}
	}	
	
	
}