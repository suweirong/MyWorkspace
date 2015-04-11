package com.shengsiyuan.serialize;

import java.io.Serializable;

public class Person implements Serializable {

	/**
	 * 
	 */
	private String name;
	
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
