package com.shengsiyuan.lesson13_IO.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIputTest1 {

	/*
	 * 创建读过来目标，读到具体数组
	 * 每次读取后，读取指针会停在中止处，等待下一次读取
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream fileStream = new FileInputStream("D:/abc/a.txt");// 创建输入流对象，把源读过来
		byte[] buffer = new byte[200]; //创建数组，用于存取对象每次读过来的信息
		int length=0;//用于获得每次实际读取长度
		while(-1!=(length=fileStream.read(buffer,0,200))){//进行读操作，读取信息放在数组中，从第一个位置开始放，设置最多读取字节数，如果读到空，中止，否则进入循环。
			String string = new String(buffer,0,length);//将数组中数据传给一个String对象
			System.out.println(string);
		}
		fileStream.close();
	}
}
