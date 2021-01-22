package com.bambooJohn.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac = new ClassPathXmlApplicationContext("aop.xml");
		MathI mathI = ac.getBean("mathImpl", MathI.class);
		System.out.println(mathI.getClass().getName());
		int result = mathI.div(4, 1);
		System.out.println(result);
		
	}

}
