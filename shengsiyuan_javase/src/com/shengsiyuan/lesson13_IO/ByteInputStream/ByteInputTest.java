package com.shengsiyuan.lesson13_IO.ByteInputStream;

import java.io.ByteArrayInputStream;


public class ByteInputTest {

	public static void main(String[] args) {
		/*
		 * ����һ��������Ŀ�꣬�Ѷ���������������
		 */
	byte[] b =new String("abc").getBytes();
	ByteArrayInputStream baf = new ByteArrayInputStream(b);//���ֽ�����ŵ��������������
	
	for(int i = 0;i<2;i++){
		int c;
		while(-1!=(c=baf.read())){//�������
			if(i==0){
				System.out.println((char)c);
			}
			else {
				System.out.println(Character.toUpperCase((char)c));
			}
		}
		baf.reset();
	}
	}
}
