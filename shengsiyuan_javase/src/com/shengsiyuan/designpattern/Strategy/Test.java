package com.shengsiyuan.designpattern.Strategy;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int result;
		//初始化获得实现对象
		Environment environment = new Environment(new Sub());
		result	= environment.caculate(1,2);
		System.out.println(result);
		//动态设置持有对象
		environment.setCaculate(new Add());
		result	= environment.caculate(11,20);
		System.out.println(result);
		
	}

}
