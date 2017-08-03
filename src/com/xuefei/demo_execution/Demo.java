package com.xuefei.demo_execution;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	private ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml",this.getClass());
	
	//jdk代理
	@Test
	public void test() {
		UserDao dao = (UserDao) ac.getBean("userDao");
		dao.save();
		dao.speak();
	}
	
	
}
