package com.shengsiyuan.designpattern.Strategy;

public class Div implements Caculate {

	@Override
	public int caculate(int a, int b) {
		return a/b;
	}

}
