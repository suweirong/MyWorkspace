package com.shengsiyuan.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MyReflection {

	public static void main(String[] args) throws Exception {
		
		MyTest mt = new MyTest();
		
		Class<MyTest> clst = MyTest.class;
		
		Method m1 = clst.getMethod("outPut",new Class[]{});
		//�����жϷ�����û�ж�Ӧ�ı����ص�VM��ע��
		if(m1.isAnnotationPresent(MyAnnotation.class)){//����ķ������ڸ�ע��
			m1.invoke(mt,new Object[]{});
			
			MyAnnotation	myAnnotation = m1.getAnnotation(MyAnnotation.class);
			
			String hello = myAnnotation.hello();
			String world = myAnnotation.world();
			System.out.println(hello+","+world);
		}
		//������б����ص�VM��Annotationע�����һ��������
		Annotation[] annotations = m1.getAnnotations();//ע���Retention��enum����ΪRuntime���ܱ�����VM�����ʵ�
		
		for(Annotation annotation:annotations){
			System.out.println(annotation.annotationType().getCanonicalName());
		}
	}
}
