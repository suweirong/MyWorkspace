package com.shengsiyuan.lesson1;
/*
 * 
 *  该类用于演示和测试值传递 
 *  值传递是针对基本数据类型
 *  一个基本类型的的变量存储的是数据本身，就是数据值
 *  传递的是数值的拷贝 
 */
public class AdsValueTest {
	
	/*
	 * 该方法的作用是接受外部基本数据值 或其他变量的数据值的拷贝 
	 * 并对自身变量值进行操作 
	 */
	public	static void change( int i) {
		//方法中参数变量被传递值时，会改变 
		System.out.println(++i);
		i=2;
	}
	
	public static void main(String[] args) {
		int i =10;
		change(i);
		System.out.println(i);
	}
	
}
