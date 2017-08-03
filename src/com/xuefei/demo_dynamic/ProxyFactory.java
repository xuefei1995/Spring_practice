package com.xuefei.demo_dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
	
	private Object target;

	public ProxyFactory(Object target) {
		this.target = target;
	}
	
	public Object getProxyInstance(){
		Object proxy = Proxy.newProxyInstance(
				target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), 
				new InvocationHandler() {                    //执行代理对象的方法时触发
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						 
						String name=method.getName();
						Object result=null;
						if("save".equals(name)){
							result = method.invoke(target, args);
						} else {
							System.out.println("=========");
							result = method.invoke(target, args);
							System.out.println("=========");
						}
						return result;
					}
				}
			);
		return proxy;
	}
}
