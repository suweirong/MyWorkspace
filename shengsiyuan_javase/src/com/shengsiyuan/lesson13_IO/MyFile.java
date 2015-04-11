package com.shengsiyuan.lesson13_IO;

import java.io.File;
import java.io.IOException;

public class MyFile {
	public static void main(String args[]) throws IOException {
		


			File file = new File("C:\\mywork\\class");
//			file.getParentFile().mkdirs();
			file.mkdirs();
			File file1 = new File("C:\\mywork\\class\\test.txt");

			file1.createNewFile();
		

	}

}