package com.shengsiyuan.network.itcast;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress1 {

	public static void main(String[] args) throws Exception {
		//���ص�ַ����
//		InetAddress asAddress = InetAddress.getLocalHost();
//		 System.out.println(asAddress.toString());
//		 System.out.println("Address: "+asAddress.getHostAddress());
//		 System.out.println("Name: "+asAddress.getHostName());
		 
		 //�����ַ����
//		 InetAddress ia = InetAddress.getByName("172.168.4.124");
//		 InetAddress ia = InetAddress.getByName("www.baidu.com");
		 InetAddress[] ia = InetAddress.getAllByName("www.renren.com");//����һ���������������IP��ַ
//		 System.out.println("Address: "+ia[1].getHostAddress());
//		 System.out.println("Address: "+ia[0].getHostAddress());
		 
		 for(InetAddress i:ia){
		 System.out.println("Address: "+i.getHostAddress());
		 }
		 System.out.println("Name: "+ia[0].getHostName());
		 
	}
}
