package com.shengsiyuan.network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnection3 {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://www.csdn.net");
		InputStream is = url.openStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String line = null;
		while(null!=(line=br.readLine())){
			System.out.println(line);
		}
		
		br.close();
	}
}
