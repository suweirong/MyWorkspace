package com.shengsiyuan.lesson13_IO.reader_writer;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.omg.CORBA.CharHolder;

public class CharArrayReaderTest {

	public static void main(String[] args) throws IOException {
//		String string = "�ټ�";
//		char [] buff = new char[string.length()];
//		string.getChars(0,buff.length,buff,0);
//		
//		CharArrayReader chArrayReader = new CharArrayReader(buff);//�Ž�ȥ��������
//		int length;
//		while(-1!=(length=chArrayReader.read())){//û������
//			System.out.println((char)length);//���������ַ��źţ�������ַ�������ʽ
//			System.out.println(length);
//		}
//		
		CharArrayWriter chaArrayWriter = new CharArrayWriter();
		String string2 ="����һ���ȴ�CharArrayWriterд�����������ַ�������Ȼ����Ҫ����ת��Ϊ�ַ�����";
		char[] buff1 = new char[string2.length()];
		string2.getChars(0,buff1.length,buff1,0);
		chaArrayWriter.write(buff1,0,buff1.length);//д������
		FileWriter fileWriter = new FileWriter("charArr.txt");
		chaArrayWriter.writeTo(fileWriter);//������������д����һ���ַ���
		fileWriter.close();//���ַ����ڻ����У�ת��������ʽ���ܣ�Ȼ��ӻ������
		chaArrayWriter.close();
	}
}
