package com.shengsiyuan.lesson13_IO;

import java.io.File;

public class FileTest4 {

	public static void main(String[] args) {
//		File file = new File("D:/Help---API");
//		String[] names = file.list();
//		for(String i: names){
//			System.out.println(i);
//		}
		
		File file = new File("D:/Help---API");
		File[] files = file.listFiles();
		for(File file2:files){
//			System.out.println(file2.getName());
			System.out.println(file2.getParent());
		}
		
	}
	}
