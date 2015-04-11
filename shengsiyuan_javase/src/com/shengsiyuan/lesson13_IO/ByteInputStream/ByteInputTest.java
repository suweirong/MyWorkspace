package com.shengsiyuan.lesson13_IO.ByteInputStream;

import java.io.ByteArrayInputStream;


public class ByteInputTest {

	public static void main(String[] args) {
		/*
		 * 创建一个读过来目标，把东西读出来给变量
		 */
	byte[] b =new String("abc").getBytes();
	ByteArrayInputStream baf = new ByteArrayInputStream(b);//把字节数组放到流里面用于输出
	
	for(int i = 0;i<2;i++){
		int c;
		while(-1!=(c=baf.read())){//这里输出
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
