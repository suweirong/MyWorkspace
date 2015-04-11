package com.shengsiyuan.exception.runorder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test3 {

	public static void main(String[] args) throws IOException {
		Exc1 exc1 = new Exc1();
		exc1.m1();
		exc1.m2();
	}
	
}

class  Exc1{
	
	public void m1() throws IOException{
		
		FileInputStream fileInputStream = new FileInputStream("ax.txt");
		fileInputStream.read();
		
	}
	public void m2(){
		System.out.println("抛出后执行不执行");
	}
	
	
}