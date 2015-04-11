package com.shengsiyuan.lesson13_IO.code;

import java.util.Properties;

public class CharSet1 {

	public static void main(String[] args) {
		Properties properties = System.getProperties();
		properties.list(System.out);
	}
}
