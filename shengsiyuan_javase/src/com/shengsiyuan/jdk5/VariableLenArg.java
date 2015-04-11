package com.shengsiyuan.jdk5;

import java.text.NumberFormat;

public class VariableLenArg {

	private String formateCurrency(float price){
		return NumberFormat.getCurrencyInstance().format(price/100);
	}
	
	public void calPrice(int price,int...discounts){
		
		float knockdownPrice = price;
		for(int discount:discounts){
			knockdownPrice = knockdownPrice * discount/100;
		}
		
		System.out.println("复杂折扣后的价格是: "+formateCurrency(knockdownPrice));
	}
	

	public static void main(String[] args) {
		VariableLenArg client = new VariableLenArg();
		client.calPrice(49900,70,80);
	}
	
	
}
