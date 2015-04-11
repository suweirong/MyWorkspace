package com.shengsiyuan.collection;

import java.util.Comparator;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class TreeSetTest2 {

	/**
	 * @param args
	 * 揭示Comparator自定义使用排序方法
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet set = new TreeSet(new StuComp() );
		Stu s1 = new Stu(101);
		Stu s2 = new Stu(201);
		Stu s3 = new Stu(301);
		Stu s4 = new Stu(401);
		Stu s5 = new Stu(501);
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		for(java.util.Iterator iterator=set.iterator();iterator.hasNext();){
			Stu str=(Stu)iterator.next();//转换为Stu
			System.out.println(str);
}
	}

}

	

class	Stu{
	int score;
	public Stu(int score){
		this.score=score;
	}
	public String toString(){
		return String.valueOf(this.score);
	}
	
	
}	

class StuComp implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		//排序对象向下转型 以便使用
		Stu s1 = (Stu)o1;
		Stu s2 = (Stu)o2;
		//针对属性设置排序规则
		//return s1.score-s2.score;
		//逆序排列
		return s2.score-s1.score;
	}
}