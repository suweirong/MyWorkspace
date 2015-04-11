package com.shengsiyuan.lesson13_IO.reader_writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("fw.txt");
		String string ="我是一个字符串，将会被写到文件中，我是字符型数据，所以用字符文件写流";
//		char buffer[] = new char[string.length()];//预建一个数组，长度为要读的长度
//		string.getChars(0,string.length(),buffer,0);//str调用自身方法从自身取长，写到目标，确定初始位置
//		for(char a:buffer){
//			fw.write(a);
//		}
//		fw.close();
		BufferedWriter bWriter = new BufferedWriter(fw);
		bWriter.write("\n");
		bWriter.write("\n");
	}

}
