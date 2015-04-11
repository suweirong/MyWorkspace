package com.shengsiyuan.lesson13_IO.reader_writer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class WriterTest {

	public static void main(String[] args) throws IOException {
		FileOutputStream fs = new FileOutputStream("zifu1.txt",true);
		OutputStreamWriter is = new OutputStreamWriter(fs);
		BufferedWriter bWriter = new BufferedWriter(is);
		bWriter.write("我是一个字符流数据，通过对字节流输出的装饰，被输出的文本上");
		bWriter.write("\n");
		bWriter.write("我也是");
		
		bWriter.close();//先写到缓冲流中国，关了的时候一起刷进去
		
		FileInputStream fileInputStream = new FileInputStream("zifu.txt");
		InputStreamReader isReader = new InputStreamReader(fileInputStream);
		BufferedReader bReader = new BufferedReader(isReader);
		String string;
		while((string=bReader.readLine()) != null){//读，赋值，判断
			System.out.println(string);
		}
		
		bReader.close();//bufferedreader没有flush，遇到readline自动读
	
	}
}
