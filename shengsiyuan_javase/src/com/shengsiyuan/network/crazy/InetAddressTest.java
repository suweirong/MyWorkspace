package com.shengsiyuan.network.crazy;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

	public static void main(String[] args) throws Exception {
		
		InetAddress ip = InetAddress.getByName("www.csdn.net");//获得InetAddress对象
		
		System.out.println("onnedu是否可达："+ip.isReachable(2000));//判断该对象是否可达
		
		System.out.println(ip.getHostAddress());
		
		InetAddress local = InetAddress.getByAddress(new byte[]{127,0,0,1});//通过数组方式获得IP
		
		System.out.println("本机是否可达: "+ local.isReachable(5000));
		
		System.out.println(local.getCanonicalHostName());
	}
}
