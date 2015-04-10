package com.io.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.SequenceInputStream;

import org.junit.AfterClass;
import org.junit.Test;

public class IOByteDemo {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * 将两个文本文件合并为另外一个文本文件
	 * */
	@Test
	public void SequenceInputStreamDemo() throws IOException {
		File file1 = new File("d:" + File.separator + "hello1.txt");
        File file2 = new File("d:" + File.separator + "hello2.txt");
        File file3 = new File("d:" + File.separator + "hello.txt");
        InputStream input1 =new FileInputStream(file1);
        InputStream input2 =new FileInputStream(file2);
        OutputStream output =new FileOutputStream(file3);
        // 合并流
        SequenceInputStream sis = new SequenceInputStream(input1, input2);
        int temp = 0;
        while((temp =sis.read()) != -1){
           output.write(temp);
        }
        input1.close();
        input2.close();
        output.close();
        sis.close();
		
	}
	
	/**
	 * 为System.out.println()重定向输出
	 * */
	@Test
	public void systemDemo() throws IOException {
		
		// 此刻直接输出到屏幕
	       System.out.println("hello");
	       File file = new File("d:" + File.separator +"hello.txt");
	       try{
	           System.setOut(new PrintStream(new FileOutputStream(file)));
	       }catch(FileNotFoundException e){
	           e.printStackTrace();
	       }
	       System.out.println("这些内容在文件中才能看到哦！");
	}
}
