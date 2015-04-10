package com.io.test;

import java.io.File;

import org.junit.AfterClass;
import org.junit.Test;

public class IOFileDemos {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * File类的两个常量
	 */
	@Test
	public void test() {
		System.out.println(File.separator);
		System.out.println(File.pathSeparator);
	}

	/**
	 * 注意使用list返回的是String数组，。而且列出的不是完整路径，如果想列出完整路径的话，需要使用listFiles.它返回的是File的数组。
	 * 
	 * 使用listFiles列出指定目录的全部文件 listFiles输出的是完整路径
	 * */
	@Test
	public void test01() {
		String fileName = "c:" + File.separator;
		File f = new File(fileName);
		String[] str = f.list();
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}

		File f1 = new File(fileName);
		File[] str1 = f1.listFiles();
		for (int i = 0; i < str1.length; i++) {
			System.out.println(str1[i]);
		}
	}

	//* 递归搜索指定目录的全部内容，包括文件和文件夹
	@Test
	public void test02() {
		String fileName = "C:" + File.separator+"temp";
		File f = new File(fileName);
		print(f);
	}

	/**
	 * 递归搜索指定目录的全部内容，包括文件和文件夹
	 * @param f
	 */
	public static void print(File f) {
		if (f != null) {
			if (f.isDirectory()) {
				File[] fileArray = f.listFiles();
				if (fileArray != null) {
					for (int i = 0; i < fileArray.length; i++) {
						print(fileArray[i]);
					}
				}

			}
			else {
				System.out.println(f);
			}

		}

	}
	
	
	
	
	
	

}
