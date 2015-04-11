package com.shengsiyuan.designpattern.composite.exampl_platefruit;

public class EatFruitClient {

	
	public static void main(String[] args) {
		Plate topPlate = new Plate();
		Plate plate11  = new Plate();
		Apple apple11  = new Apple();
		
		//fruits for plate11
		Apple apple111 = new Apple();
		Apple apple112 = new Apple();
		Kiwi  kiwi111  = new Kiwi();
		
		plate11.add(apple111);
		plate11.add(apple112);
		plate11.add(kiwi111);
		
		topPlate.add(plate11);
		topPlate.add(apple11);
		
		Plate plate12  = new Plate();
		Plate plate121 = new Plate();
		Kiwi kiwi1211  = new Kiwi();
		plate121.add(kiwi1211);
		plate12.add(plate121);
		
		Plate plate122 = new Plate();
		Plate plate1221 = new Plate();
		Kiwi kiwi12211 = new Kiwi();
		plate1221.add(kiwi12211);
		plate122.add(plate1221);
		
		plate12.add(plate122);
		
		Apple apple121 = new Apple();
		Apple apple122 = new Apple();
		Apple apple123 = new Apple();
		
		plate12.add(apple121);
		plate12.add(apple122);
		plate12.add(apple123);
		
		topPlate.add(plate12);
		
		topPlate.eat();
		
	}
}
