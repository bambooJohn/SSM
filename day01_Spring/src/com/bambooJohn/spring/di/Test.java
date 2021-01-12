package com.bambooJohn.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac = new ClassPathXmlApplicationContext("beans-di.xml");
		Student student = ac.getBean("s1", Student.class);
		System.out.println(student);
		Student student2 = ac.getBean("s2", Student.class);
		System.out.println(student2);
		Student student3 = ac.getBean("s3", Student.class);
		System.out.println(student3);
		Student student4 = ac.getBean("s4", Student.class);
		System.out.println(student4);
	}

}
