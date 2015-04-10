package com.demo.mock.one;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * 这里就简单描述下，Mock.mockClass用来存放mock类地址，Mock.mocklist用来存放需要被mock的类地址。
 * @author stevensu
 *
 * @param <T>
 */
public class MockUp<T> {

	@SuppressWarnings("unchecked")
	MockUp(){
		ParameterizedType paramType = (ParameterizedType) getClass().getGenericSuperclass();
		Type[] types = paramType.getActualTypeArguments();
		Class<?> classToMock;
		if (types[0] instanceof Class<?>) {
	         			
	        try {
	        	classToMock = (Class<?>) types[0];
	        	Class<?> mockClass = this.getClass();
				Mock.mockClass.put(classToMock.getName(),mockClass.getName());
				Mock.mocklist.put(classToMock.getName(), (T)new ProxyHandler().getProxy(classToMock.newInstance(), Mock.mockClass));
				
				
	        } catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
	    
		}
	}
		
}
