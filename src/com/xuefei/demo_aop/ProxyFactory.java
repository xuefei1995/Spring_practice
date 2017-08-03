package com.xuefei.demo_aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
		
	public Object getProxyInstance(final Object target,final TransationAop aop){
		Object proxy = Proxy.newProxyInstance(
				target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), 
				new InvocationHandler() {                    //执行代理对象的方法时触发
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						aop.begin();
						Object result = method.invoke(target, args);
						aop.close();
						return result;
					}
				}
			);
		return proxy;
	}
}
