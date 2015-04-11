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
	 //重写对象的toString 设定打印值
	public String toString() {
		// TODO Auto-generated method stub
		return "x"+"="+this.x+","+"y"+"="+this.y;
	
	}
}
