package com.shengsiyuan.lesson2;

public class Cat extends Animal {
	public  void  sing() {
		System.out.println("Cat is singing");
	}
	public void catsing(){
		System.out.println("�÷���ֻ�������У��������ͼ�ʹָ���������Ҳ�޷����ã�ֻ������ת�Ͳ��ܸ㶨");
	}
	public static void main(String[] args) {
		/*
		//����   ��������ָ�������������ٴ���������������ת���������
		 * ����ʱ����  ClassCastException
		Animal animal = new Animal();
		Cat cat =(Cat) animal;
		cat.sing();
		*/
		/*
		 * ��ȷʹ�� 
		Animal animal = new Cat();
		Cat cat = (Cat) animal;
		cat.sing();
		*/
		Animal animal= new Cat();
		Cat cat =(Cat)animal;
		cat.catsing();
	}
}
