package com.shengsiyuan.jvm;

public class Dog {

	public Dog(){
		System.out.println("Dog is loaded by: "+this.getClass().getClassLoader());
	}
}
