package com.shengsiyuan.lesson13_IO;

import java.io.File;

public class FileTest6 {

	public static void main(String[] args) {
		File file = new File("D:\\abc\\a");
		String[] names  = file.list();
		for(String name:names){
			if(name.endsWith("java")){//������Ը��ַ�����β��
				System.out.println(name);
			}
		}
	}
}
