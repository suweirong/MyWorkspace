package com.shengsiyuan.designpattern.proxy;

public class RealSubject extends Subject {

	@Override
	public void request() {

		System.out.println("Real Subject");
	}

}
