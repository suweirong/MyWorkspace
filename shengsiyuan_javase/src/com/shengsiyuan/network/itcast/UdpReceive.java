package com.shengsiyuan.network.itcast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
 * 需求:定义一个应用程序，用于接收udp协议传输的数据并处理。
 * 
 * 思路:
 * 		1.定义udpsocket服务,监听一个端口,
 * 		2.定义一个数据包，因为要存储接收到的字节数据
 * 		因为数据包对象中有更多功能可以提取字节数据中的不同数据
 * 		3.通过socket服务的receive方法将接收到的数据存入已定义好的数据包
 *      4.通过数据包对象的特有功能，将这些不同的数据数据取出
 *      5.关闭资源
 * 
 * 
 */
public class UdpReceive {

	public static void main(String[] args) throws Exception {
		// 1.创建udp的socket服务，建立端点
		// DatagramSocket ds = new DatagramSocket(5001);
		DatagramSocket ds = new DatagramSocket(13142);// 同一个端口服务不能被创建多次，不然绑定错误，端口未释放也不可以
		// 定义数据包，用于存储数据。
		while (true) {
			byte[] buf = new byte[1024];
			System.out.println("开始");

			DatagramPacket dp = new DatagramPacket(buf, buf.length);

			// 3.通过服务的receive方法将接收到数据存入数据包中。
			System.out.println("接收");
			ds.receive(dp);
			System.out.println("接收成功");
			// 4.通过数据包的方法获取其中的数据
			String ip = dp.getAddress().getHostAddress();

			String data = new String(dp.getData(), 0, dp.getLength());

			int port = dp.getPort();

			System.out.println(ip + "::" + data + "::" + port);
			Thread.sleep(1000);

			// 5.关闭资源
			ds.close();
		}
	}
}
