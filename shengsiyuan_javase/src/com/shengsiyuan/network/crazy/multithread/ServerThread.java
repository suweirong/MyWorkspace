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
		
		this.s = s;//获得socket
		
		br = new BufferedReader(new InputStreamReader(s.getInputStream()));//读取客户端socket数据
	}
	
	@Override
	public void run() {
		
		try {
			
			String content = null;
			
			while((content=readFromClient())!=null){// 读取客户端Socket,如果有数据
				
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
			return br.readLine();//返回客户端socket读取到的数据
			
		} catch (Exception e) {
			MyServer.socketList.remove(s);//有异常，就移除恢复
		}
		return null;
	}
}
