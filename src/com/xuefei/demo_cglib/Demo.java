package com.xuefei.demo_cglib;

import org.junit.Test;

public class Demo {
	
	@Test
	public void test() {
		
		UserDaoImpl dao=new UserDaoImpl();
		ProxyFactory factory=new ProxyFactory(dao);
		UserDaoImpl proxy=(UserDaoImpl) factory.getProxyInstance();
		proxy.save();
		proxy.speak();
	}
}
