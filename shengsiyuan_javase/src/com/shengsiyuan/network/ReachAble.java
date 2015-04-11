package com.shengsiyuan.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ReachAble {

	public static void main(String[] args) throws Exception {
		InetAddress as = InetAddress.getByName("www.infoq.com");
		
		System.out.println(as.isReachable(4000));
	}
}
