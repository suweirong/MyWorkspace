package com.shengsiyuan.lesson13_IO.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIputTest1 {

	/*
	 * ����������Ŀ�꣬������������
	 * ÿ�ζ�ȡ�󣬶�ȡָ���ͣ����ֹ�����ȴ���һ�ζ�ȡ
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream fileStream = new FileInputStream("D:/abc/a.txt");// �������������󣬰�Դ������
		byte[] buffer = new byte[200]; //�������飬���ڴ�ȡ����ÿ�ζ���������Ϣ
		int length=0;//���ڻ��ÿ��ʵ�ʶ�ȡ����
		while(-1!=(length=fileStream.read(buffer,0,200))){//���ж���������ȡ��Ϣ���������У��ӵ�һ��λ�ÿ�ʼ�ţ���������ȡ�ֽ�������������գ���ֹ���������ѭ����
			String string = new String(buffer,0,length);//�����������ݴ���һ��String����
			System.out.println(string);
		}
		fileStream.close();
	}
}
