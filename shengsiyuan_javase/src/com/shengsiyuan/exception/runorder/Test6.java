package com.shengsiyuan.exception.runorder;

public class Test6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(test());
	}
	
	
	public static int test()
	{
		int i=0;
		try
		{
			i = 1/0;
			i=100;
			System.out.println("after exception");
		}
		catch(Exception e)
		{
			i=1;
			System.out.println("run catch");
			return i;		//return 1 first, then execute finally,so this method return 1
		}
		finally
		{
			i=2;
			System.out.println("run finally");
		}
		i=3;
		return i; 
	}


}
