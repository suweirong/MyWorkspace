package com.shengsiyuan.lesson13_IO;

public class Feibo {

	public static int feibo(int b){
		if (b==1||b==2) {
			return 1;
		}
		else {
			return feibo(b-1)+feibo(b-2);
		}
	}
	public static void main(String[] args) {
		System.out.println(Feibo.feibo(10));
	}
}
