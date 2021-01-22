package com.bambooJohn.spring.aopxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac = new ClassPathXmlApplicationContext("aop-xml.xml");
		MathI mathI = ac.getBean("mathImpl", MathI.class);
		int add = mathI.add(1, 1);
		System.out.println(add);
	}

}
