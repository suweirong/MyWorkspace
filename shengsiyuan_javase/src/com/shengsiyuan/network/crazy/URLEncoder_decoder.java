package com.shengsiyuan.network.crazy;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLEncoder_decoder {

	public static void main(String[] args) throws Exception {
		
		String keyWord = URLDecoder.decode("%E6%9D%8E%E5%88%9A+j2ee","UTF-8");//MINE�ַ�ת���������ַ�
		
		System.out.println(keyWord);
	
		String urlStr = URLEncoder.encode("ROR���ݿ������ָ��","gbk");//�����ַ���ת���������ֽڣ�ÿ���ֽ���16�������ֱ�ʾ
		System.out.println(urlStr);
	}
}
