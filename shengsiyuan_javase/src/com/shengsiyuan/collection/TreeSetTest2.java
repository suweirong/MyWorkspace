package com.shengsiyuan.collection;

import java.util.Comparator;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class TreeSetTest2 {

	/**
	 * @param args
	 * ��ʾComparator�Զ���ʹ�����򷽷�
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
			Stu str=(Stu)iterator.next();//ת��ΪStu
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
		//�����������ת�� �Ա�ʹ��
		Stu s1 = (Stu)o1;
		Stu s2 = (Stu)o2;
		//������������������
		//return s1.score-s2.score;
		//��������
		return s2.score-s1.score;
	}
}