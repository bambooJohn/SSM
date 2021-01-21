package com.bambooJohn.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac = new ClassPathXmlApplicationContext("aop.xml");
		MathI mathI = ac.getBean("mathImpl", MathI.class);
		int result = mathI.div(4, 2);
		System.out.println(result);
		
	}

}
