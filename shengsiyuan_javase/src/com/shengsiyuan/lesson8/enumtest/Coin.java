package com.shengsiyuan.lesson8.enumtest;

public enum Coin {
	
	a("123"),b("123"),c("lk");//构造方法设定值 
	private String value;
	public String getValue(){
		return value;
	}
	 Coin(String value) {
		 this.value = value;
	 }
	 public static void main(String[] args) {
		Coin coin =Coin.a;
		System.out.println(coin.getValue());
	}
}
