package com.bambooJohn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("/mvc")
public class TestController {

	/**
	 * @RequestMapping:设置请求映射，把请求和控制层中的方法设置映射关系
	 * 当请求路径和@RequestMapping的value属性值一致时，则该注解所标注的方法即为处理请求的方法
	 * 
	 * @RequestMapping可以加在类上，也可以加在方法上
	 * 若类和方法上都加的有，应该一层一层的访问，先访问类，再访问类中的方法
	 * 
	 * method:用来设置请求方式，只有客户端发送请求的方式和method的值一致，才能处理请求
	 * 请求方式：GET 查询  POST 添加 PUT 修改 DELETE 删除
	 * params:用来设置客户端传到服务器端的数据，支持表达式
	 * username !username  username=admin  username != admin
	 * headers:用来设置请求头信息，所发送的请求的请求头信息一定要和headers属性中所设置的一致
	 * @return
	 */
	@RequestMapping(value="/test"
			,method=RequestMethod.GET
			/*,params= {"username","age!=12"}*/
			,headers= {"Accept-Language=zh-CN,zh;q=0.9,en;q=0.8"}
	)
	public String testGet() {
		
		System.out.println("SUCCESS:GET");
		
		return "success";
		
	}
	
	
	@RequestMapping(value="/test",method=RequestMethod.POST)
	public String testPost() {
		
		System.out.println("SUCCESS:POST");
		
		return "success";
		
	}
	
	/**
	 * springMVC支持Ant方式的请求路径
	 * 在Ant中，有3中匹配符
	 * *:任意字符 （/* 一层目录,*可由任意字符或任意个字符组成）
	 * ?:任意一个字符 (如下例：/ant??  ant后面可以接任意两个字符组成一层)
	 * **:任意多层目录 （/** 可以为/a/b或者/aa/bb等等）
	 * 
	 */
	@RequestMapping(value="/*/ant??/**/testAnt")
	public String testAnt() {
		
		System.out.println("SUCCESS:testAnt");
		
		return "success";
		
	}
	
	/**
	 * 以前：localhost:8080/springMVC02/testREST?id=1001&username=wangwu
	 * 现在：localhost:8080/springMVC02/testREST/1001/wangwu
	 * 
	 * @param id
	 * @param username
	 * @return
	 */
	@RequestMapping(value="/testREST/{id}/{username}")
	public String testREST(@PathVariable("id") Integer id,@PathVariable("username") String username) {
		
		System.out.println("SUCCESS:testREST");
		System.out.println(id + "=====" + username);
		
		return "success";
		
	}
	
}
