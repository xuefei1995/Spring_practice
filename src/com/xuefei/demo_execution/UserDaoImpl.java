package com.xuefei.demo_execution;

public class UserDaoImpl implements UserDao {
	
	@Override
	public void save() {
		System.out.println("ok");
	}

	@Override
	public void speak() {
		System.out.println("speak");
	}
}
