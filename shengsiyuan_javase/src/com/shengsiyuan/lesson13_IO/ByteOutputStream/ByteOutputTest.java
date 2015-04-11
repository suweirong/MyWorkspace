package com.shengsiyuan.lesson13_IO.ByteOutputStream;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ByteOutputTest {
	/*file是先指定目标对象，再把内容加进流中写出去
	 * 
	 * 而这里，是先把内容拿进来，再写出去
	 */
	
	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream f = new ByteArrayOutputStream();
		String string  = "Hello world welcome";
		byte[] buffer =string.getBytes();
		f.write(buffer);//和其他的不同，有读的嫌疑 先放入再指定对象
		byte[] result = f.toByteArray();
		for(int i=0;i<result.length;i++){
			System.out.println((char)result[i]);
		}
		OutputStream os = new FileOutputStream("byteout.txt");
		f.writeTo(os);//这里写到文件
		f.close();
		
	}
}
