package com.shengsiyuan.designpattern.decorator;
/*
 * װ�ν�ɫ
 * ����һ��������������ã�������һ�����󹹼��ӿ�һ�µĽӿ�
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
