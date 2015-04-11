package com.shengsiyuan.annotation;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class SupressWaringsTest {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Map map = new TreeMap();
		map.put("a",new Date());
		
	}
}
