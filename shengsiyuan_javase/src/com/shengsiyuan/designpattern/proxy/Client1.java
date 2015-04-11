package com.shengsiyuan.designpattern.proxy;

public class Client1 {

	public static void main(String[] args) {
		ProxySubject proxySubject = new ProxySubject();
		proxySubject.request();
	}
}
