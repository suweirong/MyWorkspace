package com.shengsiyuan.b151.staticoverride;

public class Client {
	
	public static void main(String[] args) {
		Base base = new Sub();
		base.doAnything();
		base.doSomething();
	}
	
}
