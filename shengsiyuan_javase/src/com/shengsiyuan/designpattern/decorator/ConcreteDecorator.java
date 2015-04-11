package com.shengsiyuan.designpattern.decorator;

public class ConcreteDecorator extends Decorator {

	public ConcreteDecorator(ComponentInterface component) {
		super(component);//子类调用父类构造函数,创建子类时，必须调用父类构造函数，创建一个父类对象
	}

	@Override
	public void dothing() {
		// TODO Auto-generated method stub
		super.dothing();
		this.doAnotherthing();
	}
	
	public void doAnotherthing(){
		System.out.println("功能Another");
	}

}
