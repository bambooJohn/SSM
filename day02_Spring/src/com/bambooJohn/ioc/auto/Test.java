package com.bambooJohn.ioc.auto;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("auto.xml");
		Emp emp = ac.getBean("emp", Emp.class);
		System.out.println(emp);
		
	}

}
