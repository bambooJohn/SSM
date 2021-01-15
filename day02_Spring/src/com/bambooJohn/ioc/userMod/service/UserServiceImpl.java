package com.bambooJohn.ioc.userMod.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	public UserServiceImpl() {
		System.out.println("UserServiceImpl");
	}
	
}
