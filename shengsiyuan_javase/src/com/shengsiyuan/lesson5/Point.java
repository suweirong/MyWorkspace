package com.shengsiyuan.lesson5;

public class Point {
	int x;
	int y;
	/**
	 * 
	 * @param x coordinate of x
	 * @param y coordinate of y
	 */
	public	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	 //��д�����toString �趨��ӡֵ
	public String toString() {
		// TODO Auto-generated method stub
		return "x"+"="+this.x+","+"y"+"="+this.y;
	
	}
}
