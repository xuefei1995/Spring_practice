package com.xuefei.demo_static;

public class UserDaoImplProxy implements UserDao {
	
	UserDao dao=new UserDaoImpl();
	
	@Override
	public void speak() {
		System.out.println("===========");
		dao.speak();
		System.out.println("===========");
	}

}
