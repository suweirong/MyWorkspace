package com.shengsiyuan.jvm;

public class Sample {
	public int v1 = 1;
	
	public Sample(){
		System.out.println("Sample is loaded by:" +this.getClass().getClassLoader());
		new Dog();
	}
}
