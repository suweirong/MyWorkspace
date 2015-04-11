package com.shengsiyuan.exception.myexception;

public class MyTest1 {

	public void method(String str) throws MyException{
		if(str==null){
			throw new MyException("传入的参数为空");//针对能预测并进行响应处理的情况，定义一个响应的checkedexception异常处理
		}							   //在使用的时候进行try catch 使得程序恢复
		else {
			System.out.println(str);
		}
	}
	public	void method1(){
		System.out.println("第二个方法");
	}
	
	public static void main(String[] args) {
		MyTest1 m1 = new MyTest1();
		try {
			m1.method(null);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m1.method1();
	}
}
