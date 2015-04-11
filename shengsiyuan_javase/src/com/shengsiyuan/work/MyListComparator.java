package com.shengsiyuan.work;

import java.util.Comparator;

public class MyListComparator implements Comparator<Object> {

	@Override
	public int compare(Object p1, Object p2) {
		Person mp1 = (Person)p1;
		Person mp2 = (Person)p2;
		//return mp1.getId().compareTo(mp2.getId());
//		if (mp1.getAge()>mp2.getAge()) {
//			return 1;
//		}
//		else if (mp1.getAge()==mp2.getAge()) {
//			return 0;
//		}
//		else  {
//			return -1;
//		}
		return mp1.getAge()-mp2.getAge();
	}

}
