package com.xuefei.demo_dynamic;

public class UserDaoImpl implements UserDao {

	@Override
	public void speak() {
		System.out.println("ok");
	}

	@Override
	public void save() {
		System.out.println("save()");
	}

}
