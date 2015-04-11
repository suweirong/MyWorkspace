package com.shengsiyuan.designpattern.Strategy;

public class Mul implements Caculate {

	@Override
	public int caculate(int a, int b) {
		return a*b;
	}

}
