package com.bambooJohn.ioc.userMod;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bambooJohn.ioc.userMod.controller.UserController;
import com.bambooJohn.ioc.userMod.dao.UserDaoImpl;
import com.bambooJohn.ioc.userMod.service.UserServiceImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("user.xml");
		UserController userController = ac.getBean("userController", UserController.class);
		System.out.println(userController);
		UserServiceImpl userServiceImpl = ac.getBean("userServiceImpl", UserServiceImpl.class);
		System.out.println(userServiceImpl);
		UserDaoImpl userDaoImpl = ac.getBean("userDaoImpl", UserDaoImpl.class);
		System.out.println(userDaoImpl);
		userController.addUser();
	}

}
