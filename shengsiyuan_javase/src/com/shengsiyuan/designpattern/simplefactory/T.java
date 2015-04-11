package com.shengsiyuan.designpattern.simplefactory;

public class T {

	public static void main(String[] args) {
		Product aProduct = Creator.createProduct("A");
		System.out.println(aProduct.getClass().getName());
		Product bProduct = Creator.createProduct("B");
		System.out.println(bProduct.getClass().getName());
	}
}
