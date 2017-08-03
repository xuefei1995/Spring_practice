package com.xuefei.demo_cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class ProxyFactory implements MethodInterceptor{
	
	private Object target;

	public ProxyFactory(Object target) {
		this.target = target;
	}
	
	//执行目标方法时候触发
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		 
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
	
	//生成目标对象的代理子类对象
	public Object getProxyInstance() {
		//字节码生成工具类
		Enhancer en = new Enhancer();
		//设置父类
		en.setSuperclass(target.getClass());
		//设置回调函数
		en.setCallback(this);
		//创建子类
		return en.create();
	}
	
}
