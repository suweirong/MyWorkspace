package com.shengsiyuan.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest2 {

	/**
	 * ���������ݣ��ж����ݳ��ִ���
	 * ˼·�����ݣ������  ����������
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
			//���ʱ�����ת�ͻ��� 
//			System.out.println(iterator.next()+"���ֹ�"+map.get(iterator.next())+"��");
		}
		Collection col = map.values();
		for(Iterator iterator = col.iterator();iterator.hasNext();){
			//������������ת�������֮ǰ����һ�£���Ȼ
			int s= ((Integer)(iterator.next())).intValue();
			System.out.println(s);
		}
	}

}
