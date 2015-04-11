package com.shengsiyuan.designpattern.decorator;
/*
 * 具体构建角色
 * 定义一个将要接受附加责任的类
 * 
 */
public class ConcreateComponent implements ComponentInterface {

	@Override
	public void dothing() {

		System.out.println("功能A");
	}

}
