package com.shengsiyuan.jvm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExitTest {

	public	static void Test(){
		System.out.println("�˳�ǰ");
		System.exit(0);//�˳�1
		System.out.println("�˳������");
		
	}
	
	public void fileTest(){
		File file = new File("xx.txt");
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();//�����쳣���������˳�
		}
	}
	
	public static void main(String[] args) {
		ExitTest.Test();
	}
}
//����ִ�������