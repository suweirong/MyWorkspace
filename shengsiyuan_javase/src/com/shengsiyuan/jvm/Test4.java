package com.shengsiyuan.jvm;

import java.util.Random;

class FinalTest4{
	
	public static final int a =new Random().nextInt(100);
	
	static{
		System.out.println("FinalTest4 static block");
	}
	
}

public class Test4 {

	public static void main(String[] args) {
		System.out.println(FinalTest4.a);
	}
}
