package com.shengsiyuan.lesson13_IO.ByteOutputStream;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ByteOutputTest {
	/*file����ָ��Ŀ������ٰ����ݼӽ�����д��ȥ
	 * 
	 * ��������Ȱ������ý�������д��ȥ
	 */
	
	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream f = new ByteArrayOutputStream();
		String string  = "Hello world welcome";
		byte[] buffer =string.getBytes();
		f.write(buffer);//�������Ĳ�ͬ���ж������� �ȷ�����ָ������
		byte[] result = f.toByteArray();
		for(int i=0;i<result.length;i++){
			System.out.println((char)result[i]);
		}
		OutputStream os = new FileOutputStream("byteout.txt");
		f.writeTo(os);//����д���ļ�
		f.close();
		
	}
}
