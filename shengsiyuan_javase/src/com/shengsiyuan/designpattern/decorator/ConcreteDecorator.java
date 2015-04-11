package com.shengsiyuan.designpattern.decorator;

public class ConcreteDecorator extends Decorator {

	public ConcreteDecorator(ComponentInterface component) {
		super(component);//������ø��๹�캯��,��������ʱ��������ø��๹�캯��������һ���������
	}

	@Override
	public void dothing() {
		// TODO Auto-generated method stub
		super.dothing();
		this.doAnotherthing();
	}
	
	public void doAnotherthing(){
		System.out.println("����Another");
	}

}
