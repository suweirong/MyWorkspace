package com.shengsiyuan.arithmetic.digui;

public class N {

	/*一个方法返回某个数的阶乘
	 * 数字以参数形式传递，确定返回值类型
	 * 1.设定迭代变量，不断由旧值推出新值
	 * 			方式1：设定为初始传入参数
	 * 2.迭代控制，控制何时该结束
	 * 			方式1：当变量不可再继续往下计算，可进行具体操作，给出变量值判断，进行操作
	 * 3.迭代关系式，由原有变量值推到出下一步的值
	 * 			方式1：递推
	 *  		方式2：倒推
	 */
	
	public int jc(int n){
		int result=n;
		if(n==1){
			return 1;
		}
		else {
			return result*jc(n-1);
		}
		
	}
	
	public static void main(String[] args) {
		N  n1 = new N();
		System.out.println(n1.jc(3));
	}
	
}
