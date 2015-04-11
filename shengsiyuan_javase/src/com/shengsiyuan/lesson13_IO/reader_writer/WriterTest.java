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
		bWriter.write("����һ���ַ������ݣ�ͨ�����ֽ��������װ�Σ���������ı���");
		bWriter.write("\n");
		bWriter.write("��Ҳ��");
		
		bWriter.close();//��д���������й������˵�ʱ��һ��ˢ��ȥ
		
		FileInputStream fileInputStream = new FileInputStream("zifu.txt");
		InputStreamReader isReader = new InputStreamReader(fileInputStream);
		BufferedReader bReader = new BufferedReader(isReader);
		String string;
		while((string=bReader.readLine()) != null){//������ֵ���ж�
			System.out.println(string);
		}
		
		bReader.close();//bufferedreaderû��flush������readline�Զ���
	
	}
}
