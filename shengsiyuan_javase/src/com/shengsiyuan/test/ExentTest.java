package com.shengsiyuan.test;
class Father {
	private String nameString;
	
	public Father(){
		System.out.println("father");
	}
	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	
}
class Son extends Father{
	public Son() {
		//super();
		Father father = new Father();
	}
}
public class ExentTest {
	public static void main(String[] args) {
		Son son = new Son();
		
		
	}
}
