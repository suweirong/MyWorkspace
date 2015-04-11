package com.shengsiyuan.exception.runorder;

public class Test2 {
	
	public static void main(String[] args) {
		
		try {
			int a=0;
			int b=2;
			int c=0;
			System.out.println(b/c);//遇到异常，抛出跳出处理
			System.out.println("语句块方法内部数据");
		} catch (Exception e) {
			System.out.println("抛出了一个异常");//处理完继续往下一个方法
		}

		
		System.out.println("异常被手动处理过来");
		
	}
	
	
	
}
