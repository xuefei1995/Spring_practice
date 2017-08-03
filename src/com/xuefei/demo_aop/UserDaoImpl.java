package com.xuefei.demo_aop;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Resource
	private TransationAop aop;
	@Override
	public void save() {
		System.out.println("ok");
	}
}
