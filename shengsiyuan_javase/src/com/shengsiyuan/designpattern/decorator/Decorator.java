package com.shengsiyuan.designpattern.decorator;
/*
 * 装饰角色
 * 持有一个构件对象的引用，并定义一个抽象构件接口一致的接口
 * 
 */
public class Decorator implements ComponentInterface {

	
	private ComponentInterface component;

	
	public Decorator(ComponentInterface component) {
		this.component = component;
	}
	@Override
	public void dothing() {

		component.dothing();
	}

}
