package com.shengsiyuan.b151;

public class NumberPlusPlus {

	/*
	 * count++ is an expression, return an value
	 * 
	 * 1.count -> local
	 * 2.count=count+1
	 * 3.count++=local
	 * 4.count=local
	 */
	
	public static void main(String[] args) {
		int count = 0;
		for(int i=0;i<10;i++){
			count=count++;
			//only count++ is ok
		}
		System.out.println(count);
	}
	
}
