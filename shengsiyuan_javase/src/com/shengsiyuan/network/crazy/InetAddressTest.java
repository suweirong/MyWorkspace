package com.shengsiyuan.network.crazy;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

	public static void main(String[] args) throws Exception {
		
		InetAddress ip = InetAddress.getByName("www.csdn.net");//���InetAddress����
		
		System.out.println("onnedu�Ƿ�ɴ"+ip.isReachable(2000));//�жϸö����Ƿ�ɴ�
		
		System.out.println(ip.getHostAddress());
		
		InetAddress local = InetAddress.getByAddress(new byte[]{127,0,0,1});//ͨ�����鷽ʽ���IP
		
		System.out.println("�����Ƿ�ɴ�: "+ local.isReachable(5000));
		
		System.out.println(local.getCanonicalHostName());
	}
}
