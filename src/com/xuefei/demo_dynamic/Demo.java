package com.xuefei.demo_dynamic;

import org.junit.Test;

public class Demo {
	
	@Test
	public void test() {
		
		UserDao dao=new UserDaoImpl();
		ProxyFactory factory=new ProxyFactory(dao);
		UserDao proxy=(UserDao) factory.getProxyInstance();
		proxy.save();
		proxy.speak();
	}
}
