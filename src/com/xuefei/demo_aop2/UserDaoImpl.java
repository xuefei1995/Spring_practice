package com.xuefei.demo_aop2;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Override
	public void save() {
		System.out.println("ok");
	}
}
