package com.shengsiyuan.jvm.reference;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class ObjectRefrenceType {

	public static ObjectRefrenceType obj = null;
	
	public void isAlive(){
		System.out.println("still alive");
	}
	
	//
	public static void commonref() throws InterruptedException{
		obj = new ObjectRefrenceType();
		obj = null;
//		System.out.println("before system.gc :"+wekref.get());
		System.gc();
		Thread.sleep(1000);
		
		if(obj!=null){
			obj.isAlive();
		}		
//		System.out.println("after system.gc :"+wekref.get());

	}
	
	//remove when memory not enough
	public static void softref(){
		Object1 obj = new Object1();
		SoftReference<Object1> objSoftRef=new SoftReference<Object1>(obj);  //2   
		obj=null; //4 even no direct ref
		System.out.println("before system.gc :"+objSoftRef.get());
		System.gc();
		System.out.println("after system.gc :"+objSoftRef.get());
		
//		objSoftRef.clear();//5
	}
	
	//remove next gc
	public static void weakref() throws InterruptedException{
		Object1 obj = new Object1();
		WeakReference<Object1> wekref = new WeakReference<Object1>(obj);
		obj = null;
		System.out.println("before system.gc :"+wekref.get());
		System.gc();
		Thread.sleep(1000);
		System.out.println("after system.gc :"+wekref.get());

	}
	

    public void finalize() throws Throwable{            
        super.finalize();   
//        ObjectRefrenceType.obj = this;
//        System.out.println("ObjectRefrenceType:finalize method was called!"); 

    }
	
	public static void main(String[] args) throws InterruptedException {

//		commonref();
//		softref(); 
		weakref();
	}
	
}
