package com.shengsiyuan.collection;

import java.io.ObjectOutputStream.PutField;
import java.util.LinkedList;

public class MyQueue {
	private  LinkedList<Object> list= new LinkedList<Object>();
	
	public void put(Object o){
		list.addLast(o);
	}
	
	public Object get(){
		return list.removeFirst();
	}
	
	public boolean isEmpty(){
		return list.isEmpty();
	}
	
	public static void main(String[] args) {
		MyQueue mq=new MyQueue();
		mq.put("1");
		mq.put("2");
		mq.put("3");
		System.out.println(mq.get());
		System.out.println(mq.get());
		System.out.println(mq.get());
		//System.out.println(mq.get());
		
	}
}
