package com.shengsiyuan.lesson8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TimesTest {
/*
 * 从输入的参数判断出现的次数
 * 要处理两个数据，可以通过map实现
 * 每读取一个数据时，进行一次是否存在判断，根据存在与否确定V值
 * 
 */
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
//		for (int i = 0; i < args.length; i++) {
//			if(map.get(args[i])==null){
//				map.put(args[i],1);
//			}
//			else {
//				map.put(args[i],map.get(args[i])+1);
//			}
//		}
		for(String word:args){
			map.put(word,(map.get(word)==null?1:map.get(word)+1));
		}
		
		Set<String> set = map.keySet();
		for(String s1:set){
			System.out.println(s1+":"+map.get(s1));
		}
	}
}
