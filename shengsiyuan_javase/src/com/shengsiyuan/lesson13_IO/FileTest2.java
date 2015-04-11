package com.shengsiyuan.lesson13_IO;

import java.io.File;
import java.io.IOException;

public class FileTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		File file = new File("D:/abc/a");
//		File file = new File("D:/abc");
//		File file2 = new File(file,"a/c.txt");
		File file3 = new File("D:/abc","123.txt");
		try {
			System.out.println(file3.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
