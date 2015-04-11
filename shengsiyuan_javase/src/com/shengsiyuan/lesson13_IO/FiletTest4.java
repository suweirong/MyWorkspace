package com.shengsiyuan.lesson13_IO;

import java.io.File;

public class FiletTest4 {

	public static void main(String[] args) {
		File file = new File("D:\\abc\\a\\abc.txt");
		file.delete();
	}
}
