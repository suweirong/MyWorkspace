package com.shengsiyuan.exception.myexception;

public class ZeroDividdRuntimeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ZeroDividdRuntimeException(){
		super();
	}
	
	public ZeroDividdRuntimeException(String message){
		super(message);
	}
	
}
