package com.bambooJohn.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestInterceptor {
	
	@RequestMapping("testInterceptor")
	public String testInterceptor() {
		
		return "success";
		
	}

}
