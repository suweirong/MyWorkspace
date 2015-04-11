package com.shengsiyuan.lesson13_IO.mystream;

import java.io.IOException;
import java.io.InputStream;

public class MyOwnStream1 {

	/*
	 * 
	 * 这个例子超级好啊！！！
	 */
	public static void main(String[] args) throws IOException {
		
		byte[] b = new byte[16];
		
		for(int i=0;i<b.length;i++)
		{
			b[i]=(byte)i;
		}
		
		MyByteArrayInputStream mbais = new MyByteArrayInputStream(b);
		
		while(true){
			int c=mbais.read();//调用读取，指针会下移
			if(c<0){
				break;
			}
			System.out.print(c+" ");
		}
		System.out.println();
	}
}

class MyByteArrayInputStream extends InputStream{
		//创建一个字节数组
		protected byte[]data;
		
		protected int ptr = 0;
		//初始化自己数组的值
		public  MyByteArrayInputStream(byte[] b){
			this.data=b;
		}
		
		public int read() throws IOException
		{
			return(ptr<data.length)?(data[ptr++]):-1;
			//执行方法时，返回数组的第一个字节，然后指针下移，再读再下移，读完后，返回-1
			
		}
		
}