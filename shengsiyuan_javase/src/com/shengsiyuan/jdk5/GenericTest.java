package com.shengsiyuan.jdk5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericTest {

	public static void main(String[] args) {
		Test<? extends List> aTest =null;
		aTest =new Test<LinkedList>();
		aTest = new Test<ArrayList>();
	}
}

class Test<T>{
	private T testT;

	public T getTestT() {
		return testT;
	}

	public void setTestT(T testT) {
		this.testT = testT;
	}
	
	
	
	
}