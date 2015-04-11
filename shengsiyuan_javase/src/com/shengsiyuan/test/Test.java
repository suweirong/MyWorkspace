package com.shengsiyuan.test;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Map<P, Object> map = new HashMap<P, Object>();
		P p1 = new P(1);
		P p2 = new P(2);
		map.put(p1,"123");
		map.put(p2,"233");
		System.out.println(map.get(p1));
		System.out.println(map.get(p2));
	}
	
}

class P {
	int a;
	public P(int a) {
		this.a=a;
	}
	
}
