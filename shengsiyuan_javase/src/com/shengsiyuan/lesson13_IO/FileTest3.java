package com.shengsiyuan.lesson13_IO;

import java.io.File;

public class FileTest3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		File file = new File("D:/abc/a/�´���/a/b/a");
		System.out.println(file.mkdirs());
		System.out.println(file.isFile());
	}

}
