package com.shengsiyuan.lesson13_IO.reader_writer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInputOutput {

	public static void main(String[] args) throws IOException {
		/*
		 * 首先根据内容是字节还是字符采用不同读取方式
		 * 从键盘输入内容默认是字符流的，需要以字符流形式读取
		 */
		InputStreamReader isReader = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isReader);
		//包装好获得控制台的输入缓冲流后
		String []strings= new String[10];
		for(int i=0;i<10;i++){
			strings[i] = bf.readLine();//readLine执行一次，控制台就可以输入一次，输入后，回车，就读取到，再次执行时，重新获得数据，所以要对之前的数据做好处理
		}							   // 需要执行几次，就readline一次，每次对值最好处理
		for (String string : strings) {
			System.out.println(string);
		}
	}
}
