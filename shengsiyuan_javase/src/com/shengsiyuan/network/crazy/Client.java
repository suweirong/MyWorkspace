package com.shengsiyuan.network.crazy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;



public class Client {

	public static void main(String[] args) throws Exception, IOException {
		
		Socket socket = new Socket("127.0.0.1",30000);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));//��װ�����ȡ��
		
		String line = br.readLine();
		
		System.out.println("���Է�����������: "+line);
		
		br.close();
		
		socket.close();
	}
}
