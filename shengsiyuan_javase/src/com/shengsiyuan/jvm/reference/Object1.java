package com.shengsiyuan.jvm.reference;

public class Object1 {

	public static Object1 obj1 = null;
	
	
    public void finalize() throws Throwable{            
        //super.finalize();   

    	Object1.obj1 = this;
        System.out.println("Object1 finalize method was called!"); 

    }
}
