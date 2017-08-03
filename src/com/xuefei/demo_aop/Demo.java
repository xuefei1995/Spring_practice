package com.xuefei.demo_aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	private ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml",this.getClass());
	
	@Test
	public void test() {
		UserDao dao = (UserDao) ac.getBean("userDaoProxy");
		dao.save();
	}
	
}
