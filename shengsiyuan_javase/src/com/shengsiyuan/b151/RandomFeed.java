package com.shengsiyuan.b151;

import java.util.Random;

public class RandomFeed {

	public static void main(String[] args) {
		Random r = new Random(1000);
		for(int i=0;i<3;i++){
			System.out.println(r.nextInt());
		}
	}
}
