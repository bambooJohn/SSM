package com.bambooJohn.ioc.userMod.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bambooJohn.ioc.userMod.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	public void addUser() {
		userService.addUser();
	}
	
	public UserController() {
		System.out.println("UserController");
	}

	
}
