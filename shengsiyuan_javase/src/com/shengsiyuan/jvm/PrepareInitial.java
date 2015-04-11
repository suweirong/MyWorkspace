package com.shengsiyuan.jvm;

public class PrepareInitial {
	static int i=10;
	//int j = 10;
	
	{
		System.out.println("{i"+i);
		//System.out.println("j"+j);
	}
	
	static {
		System.out.println("static	i"+i);
	//	System.out.println("j"+j);	
	}
	public static void main(String[] args) {
		ClassLoader loader = System.class.getClassLoader();
		try {
			loader.loadClass("com.shengsiyuan.jvm.PrepareInitial");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		try {
//			
//			//Class.forName("com.shengsiyuan.jvm.PrepareInitial");
//			
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
