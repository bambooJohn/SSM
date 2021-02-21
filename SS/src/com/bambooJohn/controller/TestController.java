package com.bambooJohn.controller;

import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bambooJohn.bean.Teacher;
import com.bambooJohn.bean.User;

@Controller
public class TestController {

	@RequestMapping("/testController")
	public void testControler(HttpSession session) {
		ApplicationContext ac = (ApplicationContext)session.getServletContext().getAttribute("ac");
		User user = ac.getBean(User.class);
		Teacher teacher = ac.getBean(Teacher.class);
		System.out.println(user);
		System.out.println(teacher);
	}
	
}
