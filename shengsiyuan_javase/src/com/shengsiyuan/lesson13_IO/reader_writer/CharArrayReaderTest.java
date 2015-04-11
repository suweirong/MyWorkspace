package com.shengsiyuan.lesson13_IO.reader_writer;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.omg.CORBA.CharHolder;

public class CharArrayReaderTest {

	public static void main(String[] args) throws IOException {
//		String string = "仲俭";
//		char [] buff = new char[string.length()];
//		string.getChars(0,buff.length,buff,0);
//		
//		CharArrayReader chArrayReader = new CharArrayReader(buff);//放进去，读出来
//		int length;
//		while(-1!=(length=chArrayReader.read())){//没读到空
//			System.out.println((char)length);//续到的是字符信号，输出其字符具体形式
//			System.out.println(length);
//		}
//		
		CharArrayWriter chaArrayWriter = new CharArrayWriter();
		String string2 ="我是一个等待CharArrayWriter写到缓冲区的字符串，当然，他要将我转化为字符数组";
		char[] buff1 = new char[string2.length()];
		string2.getChars(0,buff1.length,buff1,0);
		chaArrayWriter.write(buff1,0,buff1.length);//写进缓存
		FileWriter fileWriter = new FileWriter("charArr.txt");
		chaArrayWriter.writeTo(fileWriter);//将缓冲区内容写进另一个字符流
		fileWriter.close();//该字符存在缓冲中，转化了下形式可能，然后从缓存输出
		chaArrayWriter.close();
	}
}
