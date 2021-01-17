package com.bambooJohn.ioc.userMod.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		System.out.println("userDaoImpl:添加成功");
	}
	
	public UserDaoImpl() {
		System.out.println("UserDaoImpl");
	}
	
}
