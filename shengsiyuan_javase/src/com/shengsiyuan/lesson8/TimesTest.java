package com.shengsiyuan.lesson8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TimesTest {
/*
 * ������Ĳ����жϳ��ֵĴ���
 * Ҫ�����������ݣ�����ͨ��mapʵ��
 * ÿ��ȡһ������ʱ������һ���Ƿ�����жϣ����ݴ������ȷ��Vֵ
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
