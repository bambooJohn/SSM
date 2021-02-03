package com.bambooJohn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	@RequestMapping("/test")
	public String test() {
		
		//return "success";
		return "redirect:/index.jsp";
	} 
	
}
