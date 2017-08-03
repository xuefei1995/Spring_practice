package com.xuefei.demo_jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {
	
	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	public void save()  {
		String sql="insert into user(name) values(?)";
		Object[] args={"xuefei"};
		jt.update(sql, args);
	}


}
