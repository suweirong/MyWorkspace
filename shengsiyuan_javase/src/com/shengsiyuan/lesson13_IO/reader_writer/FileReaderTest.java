package com.shengsiyuan.lesson13_IO.reader_writer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {
//		FileReader fReader = new FileReader("com\\shengsiyuan\\lesson13_IO\\reader_writer\\FileReaderTest.java");
		FileReader fReader = new FileReader("E:/BOOTEX.LOG");
		BufferedReader bf = new BufferedReader(fReader);
		String string;
//		System.out.println(string);
			while((string=bf.readLine())!=null){//S b re ²»µÈ²Ù×÷s
				System.out.println(string);
			}
			bf.close();
	}
}
