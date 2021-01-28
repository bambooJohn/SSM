package com.bambooJohn.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	/**
	 * 假设：localhost:8080/SpringMVC01/hello
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping("hello")
	public String hello(String username,String password) {
	
		System.out.println(username + "=======" + password);
		return "success";  // 视图名称
		
	}
	
	@RequestMapping("test")
	public String test() {
	
		return "success";
		
	}
	
}
