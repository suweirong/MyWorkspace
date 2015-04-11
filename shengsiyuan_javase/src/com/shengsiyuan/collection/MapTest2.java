package com.shengsiyuan.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest2 {

	/**
	 * 传入多个数据，判断数据出现次数
	 * 思路：数据，与次数  这两个数据
	 * 
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		HashMap map = new HashMap();
		for(int i=0;i<args.length;i++){
			if(map.get(args[i])==null){
				map.put(args[i],new Integer(1));
			}
			else {
				map.put(args[i],((Integer)(map.get(args[i]))).intValue()+1);
			}
		}
		Set set = map.keySet();
		for(Iterator iterator=set.iterator();iterator.hasNext();){
			String key = (String)iterator.next();
			int i = ((Integer)(map.get(key))).intValue();
			System.out.println(key+":"+i);
			//输出时最好先转型回来 
//			System.out.println(iterator.next()+"出现过"+map.get(iterator.next())+"次");
		}
		Collection col = map.values();
		for(Iterator iterator = col.iterator();iterator.hasNext();){
			//对象向下类型转换必须和之前类型一致，不然
			int s= ((Integer)(iterator.next())).intValue();
			System.out.println(s);
		}
	}

}
