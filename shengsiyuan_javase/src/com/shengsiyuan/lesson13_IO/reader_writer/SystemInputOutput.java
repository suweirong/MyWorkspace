package com.shengsiyuan.lesson13_IO.reader_writer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInputOutput {

	public static void main(String[] args) throws IOException {
		/*
		 * ���ȸ����������ֽڻ����ַ����ò�ͬ��ȡ��ʽ
		 * �Ӽ�����������Ĭ�����ַ����ģ���Ҫ���ַ�����ʽ��ȡ
		 */
		InputStreamReader isReader = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isReader);
		//��װ�û�ÿ���̨�����뻺������
		String []strings= new String[10];
		for(int i=0;i<10;i++){
			strings[i] = bf.readLine();//readLineִ��һ�Σ�����̨�Ϳ�������һ�Σ�����󣬻س����Ͷ�ȡ�����ٴ�ִ��ʱ�����»�����ݣ�����Ҫ��֮ǰ���������ô���
		}							   // ��Ҫִ�м��Σ���readlineһ�Σ�ÿ�ζ�ֵ��ô���
		for (String string : strings) {
			System.out.println(string);
		}
	}
}
