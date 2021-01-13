package com.bambooJohn.ioc.life;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("life.xml");
		Person person = ac.getBean("person", Person.class);
		System.out.println(person);
		ac.close();
		
	}

}
