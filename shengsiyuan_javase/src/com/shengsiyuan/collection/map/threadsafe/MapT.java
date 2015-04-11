package com.shengsiyuan.collection.map.threadsafe;

import java.util.HashMap;

public class MapT {

	
	public static void main(String[] args) {
		transfer();
	}
	
	
	public static void transfer(){
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		for(int i=0;i<10000;i++){
			map.put(i,"1");
		}
	}
}
