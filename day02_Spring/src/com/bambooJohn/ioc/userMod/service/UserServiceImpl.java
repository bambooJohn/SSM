package com.bambooJohn.ioc.userMod.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bambooJohn.ioc.userMod.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	/*@Qualifier("userDaoMybatisImpl")*/
	private UserDao userDao;
	
	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		userDao.addUser();
	}
	
	public UserServiceImpl() {
		System.out.println("UserServiceImpl");
	}

}
