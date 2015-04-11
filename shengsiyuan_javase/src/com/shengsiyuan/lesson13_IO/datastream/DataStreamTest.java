package com.shengsiyuan.lesson13_IO.datastream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DataStreamTest {

	public static void main(String[] args) throws IOException {
		DataOutputStream dataStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("data.txt")));
		dataStream.writeByte(1);
		dataStream.writeInt(2);
		dataStream.writeChar('s');
		dataStream.writeFloat(1.1F);
		dataStream.close();
		
		DataInputStream daIn = new DataInputStream(new BufferedInputStream(new FileInputStream("data.txt")));
		System.out.println(daIn.readByte());
		System.out.println(daIn.readInt());
		System.out.println(daIn.readChar());
		System.out.println(daIn.readFloat());
	}
}
