package com.shengsiyuan.network.crazy.multithread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ServerThread implements Runnable{

	Socket s = null;
	
	BufferedReader br = null;
	
	public ServerThread(Socket s) throws IOException{
		
		this.s = s;//���socket
		
		br = new BufferedReader(new InputStreamReader(s.getInputStream()));//��ȡ�ͻ���socket����
	}
	
	@Override
	public void run() {
		
		try {
			
			String content = null;
			
			while((content=readFromClient())!=null){// ��ȡ�ͻ���Socket,���������
				
				for(Socket s:MyServer.socketList){
					PrintStream ps = new PrintStream(s.getOutputStream());//
					ps.println(content);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	private String readFromClient(){
		try {
			return br.readLine();//���ؿͻ���socket��ȡ��������
			
		} catch (Exception e) {
			MyServer.socketList.remove(s);//���쳣�����Ƴ��ָ�
		}
		return null;
	}
}
