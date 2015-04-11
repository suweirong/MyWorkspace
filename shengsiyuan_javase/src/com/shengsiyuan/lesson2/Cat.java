package com.shengsiyuan.lesson2;

public class Cat extends Animal {
	public  void  sing() {
		System.out.println("Cat is singing");
	}
	public void catsing(){
		System.out.println("该方法只有子类有，父类类型即使指向子类对象也无法调用，只有向下转型才能搞定");
	}
	public static void main(String[] args) {
		/*
		//错误   父类引用指向子类对象才能再次向下用子类引用转向子类对象
		 * 运行时错误  ClassCastException
		Animal animal = new Animal();
		Cat cat =(Cat) animal;
		cat.sing();
		*/
		/*
		 * 正确使用 
		Animal animal = new Cat();
		Cat cat = (Cat) animal;
		cat.sing();
		*/
		Animal animal= new Cat();
		Cat cat =(Cat)animal;
		cat.catsing();
	}
}
