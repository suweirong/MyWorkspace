package com.shengsiyuan.network.itcast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
 * ����:����һ��Ӧ�ó������ڽ���udpЭ�鴫������ݲ�����
 * 
 * ˼·:
 * 		1.����udpsocket����,����һ���˿�,
 * 		2.����һ�����ݰ�����ΪҪ�洢���յ����ֽ�����
 * 		��Ϊ���ݰ��������и��๦�ܿ�����ȡ�ֽ������еĲ�ͬ����
 * 		3.ͨ��socket�����receive���������յ������ݴ����Ѷ���õ����ݰ�
 *      4.ͨ�����ݰ���������й��ܣ�����Щ��ͬ����������ȡ��
 *      5.�ر���Դ
 * 
 * 
 */
public class UdpReceive {

	public static void main(String[] args) throws Exception {
		// 1.����udp��socket���񣬽����˵�
		// DatagramSocket ds = new DatagramSocket(5001);
		DatagramSocket ds = new DatagramSocket(13142);// ͬһ���˿ڷ����ܱ�������Σ���Ȼ�󶨴��󣬶˿�δ�ͷ�Ҳ������
		// �������ݰ������ڴ洢���ݡ�
		while (true) {
			byte[] buf = new byte[1024];
			System.out.println("��ʼ");

			DatagramPacket dp = new DatagramPacket(buf, buf.length);

			// 3.ͨ�������receive���������յ����ݴ������ݰ��С�
			System.out.println("����");
			ds.receive(dp);
			System.out.println("���ճɹ�");
			// 4.ͨ�����ݰ��ķ�����ȡ���е�����
			String ip = dp.getAddress().getHostAddress();

			String data = new String(dp.getData(), 0, dp.getLength());

			int port = dp.getPort();

			System.out.println(ip + "::" + data + "::" + port);
			Thread.sleep(1000);

			// 5.�ر���Դ
			ds.close();
		}
	}
}
