package com.shengsiyuan.lesson2;

import java.util.Random;

public class RandomTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int result = random.nextInt(32)+1;
		System.out.println(result);
	}

}
