package com.shengsiyuan.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MyReflection {

	public static void main(String[] args) throws Exception {
		
		MyTest mt = new MyTest();
		
		Class<MyTest> clst = MyTest.class;
		
		Method m1 = clst.getMethod("outPut",new Class[]{});
		//这是判断方法有没有对应的被加载的VM的注解
		if(m1.isAnnotationPresent(MyAnnotation.class)){//如果改方法存在该注解
			m1.invoke(mt,new Object[]{});
			
			MyAnnotation	myAnnotation = m1.getAnnotation(MyAnnotation.class);
			
			String hello = myAnnotation.hello();
			String world = myAnnotation.world();
			System.out.println(hello+","+world);
		}
		//获得所有被加载到VM的Annotation注解对象到一个数组中
		Annotation[] annotations = m1.getAnnotations();//注解的Retention中enum类型为Runtime才能被读进VM来访问到
		
		for(Annotation annotation:annotations){
			System.out.println(annotation.annotationType().getCanonicalName());
		}
	}
}
