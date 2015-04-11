package com.shengsiyuan.network.itcast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * 需求:通过UDP传输方式，将一段文字数据发送出去
 * 思路：
 * 		1.建立udpsocket服务。
 * 		2.提供数据，并将数据封装到数据包中
 * 		3.通过socket服务的发送功能，将数据包发送出去
 * 		4.关闭资源
 */
public class UdpSend {

	public static void main(String[] args) throws Exception {
		//建立服务
		DatagramSocket ds = new DatagramSocket();
		
		//建立数据并包装
		byte buf[] = " udp data lai le ".getBytes();
		DatagramPacket dp = new DatagramPacket(buf,buf.length,InetAddress.getByName("10.30.6.123"),13142);
		
		//发送
//		System.out.println("发送");
		ds.send(dp);
//		System.out.println("发送完毕");
		// 关闭资源
//		ds.close();
//		System.out.println("关闭");
	}
}
