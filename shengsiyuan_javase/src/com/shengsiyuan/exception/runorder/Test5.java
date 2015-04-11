package com.shengsiyuan.exception.runorder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test5 {

	public static void main(String[] args)  {
		Exc3 exc1 = new Exc3();
		exc1.m1();
		exc1.m2();
	}
	
}
/*
 * 本代码和Test3,Test4做比较，try catch 后只是进行默认堆栈打印的后果
 * 如果try catch后，进行默认堆栈打印，和直接抛出去是一样的，程序会终止
 * 所以我们默认情况下，需要结合情况，做出自己的处理，他本来就是为了这样设计的
 * 
 * 方法加throws，让调用者进行自己处理，这样灵活方便
 * 
 * 如果一致throws到最终，那么出现问题后，虚拟机进行打印错误信息处理，程序终止
 * 没达到针对checkedException该做的处理
 * 
 */
class  Exc3{
	
	public void m1() {

			FileInputStream fileInputStream=null;
			try {
				fileInputStream = new FileInputStream("ax.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("未找到源文件");
//				e.printStackTrace();
			}
			try {
				fileInputStream.read();//一个未处理的异常，程序终止
										//前面的获得流出现异常，导致这里空指针，引发运行时异常，程序不会提示，虚拟机处理，程序终止
										//正确的处理方式，
			} catch (Exception e) {
				// TODO Auto-generated catch block
//				System.out.println("文件无法读取");
				e.printStackTrace();
			}


		
	}
	public void m2(){
		System.out.println("抛出后执行");
	}
	
	
}