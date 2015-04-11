package com.shengsiyuan.arithmetic.diedai;

public class Rabbit {

	/*
	 * 兔子每月产一个，N个月后多少个
	 */
	public	static int getRabbit(int a,int n){
		int x = a;
		for(int i=0;i<n;i++){
			int y =2*x;
			x=y;
		}
		return x;
	}
	public static void main(String[] args) {
	int m =	Rabbit.getRabbit(1,12);
	System.out.println(m);
	}	
}
