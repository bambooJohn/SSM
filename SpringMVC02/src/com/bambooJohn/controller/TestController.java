package com.bambooJohn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	/**
	 * @RequestMapping:设置请求映射，把请求和控制层中的方法设置映射关系
	 * 当请求路径和@RequestMapping的value属性值一致时，则该注解所标注的方法即为处理请求的方法
	 * method:用来设置请求方式，只有客户端发送请求的方式和method的值一致，才能处理请求
	 * 请求方式：GET 查询  POST 添加 PUT 修改 DELETE 删除
	 * params:用来设置客户端传到服务器端的数据，支持表达式
	 * username !username  username=admin  username != admin
	 * 
	 * @return
	 */
	@RequestMapping(value="/test",method=RequestMethod.GET,params= {"username","age!=12"})
	public String testGet() {
		
		System.out.println("SUCCESS:GET");
		
		return "success";
		
	}
	
	@RequestMapping(value="/test",method=RequestMethod.POST)
	public String testPost() {
		
		System.out.println("SUCCESS:POST");
		
		return "success";
		
	}
	
}
