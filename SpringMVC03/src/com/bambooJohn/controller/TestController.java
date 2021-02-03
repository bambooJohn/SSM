package com.bambooJohn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	/**
	 * View作用：处理模型数据，实现页面跳转（转发，重定向）
	 * View作用：
	 * InternalResourceView:转发视图
	 * JstlView:转发视图
	 * RedirectView:重定向视图
	 * 
	 * @return
	 */
	@RequestMapping(value="/test",method=RequestMethod.POST)
	public String test(String username) {
		System.out.println(username);
		return "success";
		//return "redirect:/index.jsp";
	} 
	
}
