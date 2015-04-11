package com.shengsiyuan.exception.runorder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test4 {

	public static void main(String[] args)  {
		Exc2 exc1 = new Exc2();
		exc1.m1();
		exc1.m2();
	}
	
}
/*
 * 本代码和Test3做比较，比较一直throws和最终try catch的区别
 * try catch后程序会对当前方法做出处理，可能是恢复，可能是让client进行响应的恢复，最终实现回复 的功能
 * 
 * 方法加throws，让调用者进行自己处理，这样灵活方便
 * 
 * 如果一致throws到最终，那么出现问题后，虚拟机进行打印错误信息处理，程序终止
 * 没达到针对checkedException该做的处理
 * 
 */
class  Exc2{
	
	public void m1() {
		try {
			FileInputStream fileInputStream = new FileInputStream("ax.txt");
			fileInputStream.read();
		} catch (Exception e) {
//			System.out.println("未找到文件，请检查是否有读取源文件");
//			e.printStackTrace();
		}

		
	}
	public void m2(){
		System.out.println("处理后恢复执行");
	}
	
	
}