package com.shengsiyuan.network.itcast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * ����:ͨ��UDP���䷽ʽ����һ���������ݷ��ͳ�ȥ
 * ˼·��
 * 		1.����udpsocket����
 * 		2.�ṩ���ݣ��������ݷ�װ�����ݰ���
 * 		3.ͨ��socket����ķ��͹��ܣ������ݰ����ͳ�ȥ
 * 		4.�ر���Դ
 */
public class UdpSend {

	public static void main(String[] args) throws Exception {
		//��������
		DatagramSocket ds = new DatagramSocket();
		
		//�������ݲ���װ
		byte buf[] = " udp data lai le ".getBytes();
		DatagramPacket dp = new DatagramPacket(buf,buf.length,InetAddress.getByName("10.30.6.123"),13142);
		
		//����
//		System.out.println("����");
		ds.send(dp);
//		System.out.println("�������");
		// �ر���Դ
//		ds.close();
//		System.out.println("�ر�");
	}
}
