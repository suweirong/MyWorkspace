package com.shengsiyuan.designpattern.proxy;

public class ProxySubject extends Subject {
	
	RealSubject realSubject;
	
	@Override
	public void request() {
		if(realSubject==null){
			realSubject=new RealSubject();
		}
		pro1();
		realSubject.request();
		pro2();
	}

	private void pro1(){
		System.out.println("Proxy1");
	}
	private void pro2(){
		System.out.println("Proxy2");
	}
}
