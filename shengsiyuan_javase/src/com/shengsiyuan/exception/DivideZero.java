package com.shengsiyuan.exception;

import com.shengsiyuan.exception.myexception.ZeroDividdException;
import com.shengsiyuan.exception.myexception.ZeroDividdRuntimeException;

public class DivideZero {

	public int dz(int a) {
		return 10 / a;
	}

	public int dz1(int a) throws ZeroDividdException {
		if (a == 0) {
			throw new ZeroDividdException("0 can't be divided!");
		} else {
			return 10 / a;
		}
	}

	public int dz2(int a) throws ZeroDividdRuntimeException {
		if (a == 0) {
			throw new ZeroDividdRuntimeException("0 can't be divided!");
		} else {
			return 10 / a;
		}
	}

	public static void main(String[] args) {
		DivideZero d = new DivideZero();
		
		 System.out.println(d.dz(0));
		 System.out.println("go on....");
		
//		d.dz2(0);

		
//		try {
//			int a = d.dz1(0);
//			System.out.println("...");// will not be executed
//		} catch (ZeroDividdException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//		}
//		System.out.println("go ahead");
	}

}
