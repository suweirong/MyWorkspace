package com.shengsiyuan.lesson13_IO.serial;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;

public class CharSetTest {

	public static void main(String[] args) {
		SortedMap<String,Charset> map = Charset.availableCharsets();
		Set<String> set = map.keySet();//参数指定类型，定义时指定变量类型，方法返回变量指定返回类型
		for(Iterator<String> iter = set.iterator();iter.hasNext();){
			System.out.println(iter.next());
		}
	}
}
