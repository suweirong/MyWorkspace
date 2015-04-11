package com.shengsiyuan.network.crazy.multithread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MyServer {

	//创建list存储客户端Socket
	public static ArrayList<Socket> socketList = new ArrayList<Socket>();
	
	public static void main(String[] args) throws IOException {
		
		ServerSocket ss = new ServerSocket(30000);
		
		while(true){
			
			Socket s = ss.accept();//保持监听,返回客户端Socket
			
			socketList.add(s);//获得客户端Socket
			
			new Thread(new ServerThread(s)).start();//开启线程进行输出
			
		}
	}
}
