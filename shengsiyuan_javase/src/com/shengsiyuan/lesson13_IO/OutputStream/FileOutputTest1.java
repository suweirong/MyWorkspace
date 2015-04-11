package com.shengsiyuan.lesson13_IO.OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest1 {
	/*
	 * 创建写过去目标，东西放进去  write
	 */
	public static void main(String[] args) throws IOException {
		FileOutputStream fileOut = new FileOutputStream("D:/abc/a.txt",true);//创建一个读过去的源
		String string ="xxI am a String ,going to native file,before which,I have to go to char";
		byte[] buffer = string.getBytes();
		fileOut.write(buffer,0,buffer.length);//把数组放到流里面输出到目标
				
		fileOut.close();
			
		}
	}

