package com.shengsiyuan.lesson2;

public class PolyTest2 {
	/*
	public void run(BMW bmw){
		bmw.run();
	}
	public void run(QQ qq){
		qq.run();
	}
	public void run(BENZI bz){
		bz.run();
	}
	*/
	public void run(Car car){
		car.run();
	}
	
	public static void main(String[] args) {
		PolyTest2 pt= new PolyTest2();
		BENZI bz = new BENZI();
		pt.run(bz);
	}
}

class Car{
	public  void run(){
		System.out.println("Car is running");
	}
}

class BMW extends Car{
	public  void run(){
		System.out.println("BMW is running");
	}
}

class QQ extends Car{
	public  void run(){
		System.out.println("QQ is running");
	}
}

class BENZI extends Car{
	public  void run(){
		System.out.println("BENZI is running");
	}
}