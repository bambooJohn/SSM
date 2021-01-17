package com.bambooJohn.ioc.userMod.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoMybatisImpl implements UserDao {

	
	
	public UserDaoMybatisImpl() {
		System.out.println("UserDaoMybatisImpl");
	}

	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		System.out.println("userDaoMybatisImpl:添加成功");
	}

}
