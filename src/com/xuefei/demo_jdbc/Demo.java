package com.xuefei.demo_jdbc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	private ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml",this.getClass());
	@Test
	public void test()  {
		UserDao dao=(UserDao) ac.getBean("userDao");
		dao.save();
	}
}
