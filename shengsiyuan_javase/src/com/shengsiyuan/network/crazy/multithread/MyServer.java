package com.shengsiyuan.network.crazy.multithread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MyServer {

	//����list�洢�ͻ���Socket
	public static ArrayList<Socket> socketList = new ArrayList<Socket>();
	
	public static void main(String[] args) throws IOException {
		
		ServerSocket ss = new ServerSocket(30000);
		
		while(true){
			
			Socket s = ss.accept();//���ּ���,���ؿͻ���Socket
			
			socketList.add(s);//��ÿͻ���Socket
			
			new Thread(new ServerThread(s)).start();//�����߳̽������
			
		}
	}
}
