package com.shengsiyuan.lesson8.enumtest;

/**
 * @author Administrator
 *
 */
public class Test1 {

	public static void main(String[] args) {
		System.out.println(Color.id);
		for(Color co:Color.values()){
			System.out.println(co);
		}
	}
}
