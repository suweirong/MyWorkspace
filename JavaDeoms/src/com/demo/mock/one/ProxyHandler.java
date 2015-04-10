package com.demo.mock.one;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

/**
 * 这里就简单使用下if(method.getName().equals(m.getName()))，在new MockUp<UserDAOImpl>()中加入了注解@MockMe 我们当然是可以找到要被mock的方法的。
 * @author stevensu
 *
 */
public class ProxyHandler implements InvocationHandler {
	private Object old;
	
	private Map map;

	public Object getProxy(Object obj, Map map) {
		this.old = obj;
		this.map = map;
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj
				.getClass().getInterfaces(), this);
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		String _classPath = (String)map.get(old.getClass().getName());
		Class c;
		try {
			c = Class.forName(_classPath);
			Object o = c.newInstance();
			Method[] methods = c.getMethods();
			for(Method m:methods){
				if(method.getName().equals(m.getName())){
					return m.invoke(o, args);
				}
			}
		} catch (Exception e) {
			
		}
		
		Object r = method.invoke(old, args);
		return r;
	}

}