package com.shengsiyuan.collection2;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Properties  p = System.getProperties();
		Set set = p.keySet();
		for(Iterator iterator = set.iterator();iterator.hasNext();){
			String key = (String)iterator.next();
			String value = p.getProperty(key);
			System.out.println(key+":"+value);
		}
	}

}
