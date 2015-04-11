package com.shengsiyuan.network;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnection {

	//获得URLConncetion，获得输入流
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://www.infoq.com");
//		URLConnection conn = url.openConnection();
//		InputStream is = conn.getInputStream();
		InputStream is = url.openStream();
 		FileOutputStream fs = new FileOutputStream(new File("network.txt"),true);
		byte[] buffer = new byte[2048];
		int length=0;
		while((length=is.read(buffer,0,buffer.length))!=-1){
			fs.write(buffer);
		}
		is.close();
		fs.close();
	}
}
