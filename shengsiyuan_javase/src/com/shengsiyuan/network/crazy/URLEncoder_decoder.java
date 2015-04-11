package com.shengsiyuan.network.crazy;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLEncoder_decoder {

	public static void main(String[] args) throws Exception {
		
		String keyWord = URLDecoder.decode("%E6%9D%8E%E5%88%9A+j2ee","UTF-8");//MINE字符转换成中文字符
		
		System.out.println(keyWord);
	
		String urlStr = URLEncoder.encode("ROR敏捷开发最佳指南","gbk");//中文字符串转换成两个字节，每个字节用16进制数字表示
		System.out.println(urlStr);
	}
}
