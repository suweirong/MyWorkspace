package com.shengsiyuan.lesson13_IO.mystream;

import java.io.IOException;
import java.io.InputStream;

public class MyOwnStream1 {

	/*
	 * 
	 * ������ӳ����ð�������
	 */
	public static void main(String[] args) throws IOException {
		
		byte[] b = new byte[16];
		
		for(int i=0;i<b.length;i++)
		{
			b[i]=(byte)i;
		}
		
		MyByteArrayInputStream mbais = new MyByteArrayInputStream(b);
		
		while(true){
			int c=mbais.read();//���ö�ȡ��ָ�������
			if(c<0){
				break;
			}
			System.out.print(c+" ");
		}
		System.out.println();
	}
}

class MyByteArrayInputStream extends InputStream{
		//����һ���ֽ�����
		protected byte[]data;
		
		protected int ptr = 0;
		//��ʼ���Լ������ֵ
		public  MyByteArrayInputStream(byte[] b){
			this.data=b;
		}
		
		public int read() throws IOException
		{
			return(ptr<data.length)?(data[ptr++]):-1;
			//ִ�з���ʱ����������ĵ�һ���ֽڣ�Ȼ��ָ�����ƣ��ٶ������ƣ�����󣬷���-1
			
		}
		
}