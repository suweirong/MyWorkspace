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
		String string ="����һ���ַ��������ᱻд���ļ��У������ַ������ݣ��������ַ��ļ�д��";
//		char buffer[] = new char[string.length()];//Ԥ��һ�����飬����ΪҪ���ĳ���
//		string.getChars(0,string.length(),buffer,0);//str����������������ȡ����д��Ŀ�꣬ȷ����ʼλ��
//		for(char a:buffer){
//			fw.write(a);
//		}
//		fw.close();
		BufferedWriter bWriter = new BufferedWriter(fw);
		bWriter.write("\n");
		bWriter.write("\n");
	}

}
