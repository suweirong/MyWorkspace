package com.shengsiyuan.lesson2;
/*
 * 介绍多态的运行时特性 
 * 编译时不知道，执行时才周到指向谁
 */
public class PolyTest {
	public static void main(String[] args) {
		A a =null;
		if(args[0].equals("b")){
			a=new B();
		}
		if(args[0].equals("c")){
			a=new C();
		}
		if(args[0].equals("d")){
			a=new D();
		}
		a.method();
	}
}

class A{
	
	public void method(){
		System.out.println("A");
	}
}
class B extends A{
	
	public void method(){
		System.out.println("B");
	}
}
class C extends A{
	
	public void method(){
		System.out.println("C");
	}
}
class D extends A{
	
	public void method(){
		System.out.println("D");
	}
}
