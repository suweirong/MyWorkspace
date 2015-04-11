package com.shengsiyuan.designpattern.Strategy.comparatorTest;

import java.util.Comparator;

public class MyComparator implements Comparator<Object> {

	@Override
	public int compare(Object p1, Object p2) {
		// TODO Auto-generated method stub
		Person mp1 =(Person)p1;
		Person mp2 =(Person)p2;
		return mp1.age-mp2.age;
	}

}
