package com.shengsiyuan.lesson13_IO.OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest1 {
	/*
	 * ����д��ȥĿ�꣬�����Ž�ȥ  write
	 */
	public static void main(String[] args) throws IOException {
		FileOutputStream fileOut = new FileOutputStream("D:/abc/a.txt",true);//����һ������ȥ��Դ
		String string ="xxI am a String ,going to native file,before which,I have to go to char";
		byte[] buffer = string.getBytes();
		fileOut.write(buffer,0,buffer.length);//������ŵ������������Ŀ��
				
		fileOut.close();
			
		}
	}

