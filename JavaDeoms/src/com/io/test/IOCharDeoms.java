package com.io.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.junit.AfterClass;
import org.junit.Test;

public class IOCharDeoms {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * 字符流
	 * 从文件中读出内容
	 * 以循环方式从文件中读取内容
	 * */
	@Test
	public void readDemo() throws IOException {
		String fileName="D:"+File.separator+"hello.txt";
	       File f=new File(fileName);
	       char[] ch=new char[100];
	       Reader read=new FileReader(f);
	       int temp=0;
	       int count=0;
	       while((temp=read.read())!=(-1)){
	           ch[count++]=(char)temp;
	       }
	       read.close();
	       System.out.println("内容为"+new String(ch,0,count));
	}

}
