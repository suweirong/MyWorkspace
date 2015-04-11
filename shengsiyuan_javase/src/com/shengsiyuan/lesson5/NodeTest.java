package com.shengsiyuan.lesson5;

public class NodeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node1=new Node("node1");
		Node node2=new Node("node2");
		Node node3=new Node("node3");
		node1.next=node2;
		node2.next=node3;
		System.out.println(node1.next.next.data);
		System.out.println("------------------");
		Node node4=new Node("node4");
		node1.next=node4;
		node4.next=node2;
		System.out.println(node1.next.data);
		System.out.println("------------------");
		node1.next=node2;
		node4.next=null;

	}

}
