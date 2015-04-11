package com.shengsiyuan.lesson8;

import java.util.ArrayList;
import java.util.List;

public class BoxTest {

	public static void main(String[] args) {
		List<Integer> integer = new ArrayList<Integer>();
		integer.add(1);//限定加类型的，但是可以直接加基本数据类型，底层转换成Integer
		integer.add(2);
		integer.add(3);
		for(Integer i:integer){
			System.out.println(i);//输出的时候，会自动将Integer转换为int输出
		}
	}
}
