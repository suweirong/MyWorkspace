package com.shengsiyuan.network.tcp;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

	public static void main(String[] args) throws Exception {
		
		ServerSocket ss = new ServerSocket(5001);
		Socket socket = ss.accept();
		InputStream is = socket.getInputStream();
		byte[] buffer= new byte[200];
		int length=0;
		while(-1!=(length=is.read(buffer,0,buffer.length))){
			System.out.println(new String(buffer,0,length));
		}
		is.close();
		socket.close();
//		System.out.println("Hello world!");
	}
}
