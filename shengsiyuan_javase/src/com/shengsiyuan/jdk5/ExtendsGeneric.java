package com.shengsiyuan.jdk5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExtendsGeneric {

	public static void main(String[] args) {
		ListGetSet<ArrayList> listGetSet = new ListGetSet<ArrayList>();
		ListGetSet<LinkedList<?>> linkListGetSet = new ListGetSet<LinkedList<?>>();
		LinkedList[] linkedList = new LinkedList[10];
		ArrayList[] arrayLists = new ArrayList[10];
		listGetSet.setList(arrayLists);
		linkListGetSet.setList(linkedList);
	}
}

class ListGetSet <T extends List<?>>{
	private T list [];

	public T[] getList() {
		return list;
	}

	public void setList(T[] list) {
		this.list = list;
	}
	
	
	
}