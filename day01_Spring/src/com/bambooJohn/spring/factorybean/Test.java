package com.bambooJohn.spring.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac = new ClassPathXmlApplicationContext("factory-bean.xml");
		Object object = ac.getBean("factory");
		System.out.println(object);
	}

}
