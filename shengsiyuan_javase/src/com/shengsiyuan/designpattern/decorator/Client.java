package com.shengsiyuan.designpattern.decorator;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//�ڵ���
		ComponentInterface component = new ConcreateComponent();
		
		//������
		ComponentInterface component2 = new ConcreteDecorator(component);
		ComponentInterface component3 = new ConcreteDecorator2(component2);
		component3.dothing();
	}

}
