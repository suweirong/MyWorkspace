package com.shengsiyuan.network.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClient {

	public static void main(String[] args) throws Exception, IOException {
		Socket socket = new Socket("127.0.0.1",5001);
		OutputStream os = socket.getOutputStream();
		os.write("hello".getBytes());
		
		socket.close();
		os.close();
	}
	
}
