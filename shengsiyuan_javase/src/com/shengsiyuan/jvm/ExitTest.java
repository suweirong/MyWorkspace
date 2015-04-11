package com.shengsiyuan.jvm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExitTest {

	public	static void Test(){
		System.out.println("退出前");
		System.exit(0);//退出1
		System.out.println("退出后语句");
		
	}
	
	public void fileTest(){
		File file = new File("xx.txt");
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();//遇到异常或程序错误退出
		}
	}
	
	public static void main(String[] args) {
		ExitTest.Test();
	}
}
//程序执行完结束