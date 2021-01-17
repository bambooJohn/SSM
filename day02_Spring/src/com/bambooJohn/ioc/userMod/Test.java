package com.bambooJohn.ioc.userMod;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bambooJohn.ioc.userMod.controller.UserController;
import com.bambooJohn.ioc.userMod.dao.UserDao;
import com.bambooJohn.ioc.userMod.dao.UserDaoImpl;
import com.bambooJohn.ioc.userMod.service.UserService;
import com.bambooJohn.ioc.userMod.service.UserServiceImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("user.xml");
		UserController userController = ac.getBean("aaa", UserController.class);
		System.out.println(userController);
		UserService userService = ac.getBean("userServiceImpl", UserServiceImpl.class);
		System.out.println(userService);
		UserDao userDao = ac.getBean("userDaoImpl", UserDaoImpl.class);
		System.out.println(userDao);
		userController.addUser();
	}

}
