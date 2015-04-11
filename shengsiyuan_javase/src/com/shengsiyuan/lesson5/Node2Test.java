package com.shengsiyuan.lesson5;

public class Node2Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node2 n1=new Node2("n1");
		Node2 n2=new Node2("n2");
		Node2 n3=new Node2("n3");
		Node2 n4=new Node2("n4");
		Node2 n5=new Node2("n5");
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n1;
		n1.previous=n5;
		n2.previous=n1;
		n3.previous=n2;
		n4.previous=n3;
		n5.previous=n4;
		System.out.println("n3的前驱:"+n3.previous.data);
		System.out.println("n5的后继:"+n5.next.data);
		
		//插入数据 
		Node2 nx2=new Node2("nx2");
		n1.next=nx2;
		nx2.previous=n1;
		nx2.next=n2;
		n2.previous=nx2;
		System.out.println("插入后数据 n1后继:"+n1.next.data);
		System.out.println("插入后数据 n2后继:"+n2.previous.data);
		
	}

}
