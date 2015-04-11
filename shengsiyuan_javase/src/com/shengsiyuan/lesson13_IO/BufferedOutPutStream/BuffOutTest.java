package com.shengsiyuan.lesson13_IO.BufferedOutPutStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class BuffOutTest {

	public static void main(String[] args) throws IOException {
		OutputStream outputStream = new FileOutputStream("1.txt");
		BufferedOutputStream bf = new BufferedOutputStream(outputStream);
		bf.write("lasdjflasdkfjl".getBytes());
//		bf.flush();
		bf.close();
	}
}
