package com.shengsiyuan.designpattern.proxy.dynamicproxy;

public class RealSubject implements Subject {

	@Override
	public void request() {
		// TODO Auto-generated method stub
		System.out.println("From Real Subject");
	}

}
