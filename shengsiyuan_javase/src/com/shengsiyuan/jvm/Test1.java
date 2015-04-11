package com.shengsiyuan.jvm;

import java.util.Random;

public class Test1 {

	/*
	 * 由静态方法的调用引起，加载，准备赋默认值，开始从上到下初始化
	 */
	private static Test1 test1 = new Test1();//静态变量加载后就立刻执行准备，初始化，返回实例
//	private static int count1;
//	private static int  count2=0;
	private  int count1=10;
	private  int  count2=0;  //对象变量只在准备阶段和方法内改变值，不会再像静态变量那样再次初始化
	private  int count3=new Random().nextInt(100);
	private static int count4 =10;
	private Test1(){
		count1++;
		count2++;
	}
	
	
	static{
		System.out.println("Static初始化块");
	}
	{
		System.out.println("初始化块");//准备阶段
		System.out.println(count1);
		System.out.println(count3);
		System.out.println(test1);
		System.out.println(count4);
	}
	public static Test1 getInstance(){
		return test1;
	}
	public static void main(String[] args) {
		Test1 t1Test1 = Test1.getInstance();
//		System.out.println(t1Test1.count1);
//		//System.exit(0);
//		System.out.println(t1Test1.count2);
	}
}

