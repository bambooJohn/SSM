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
		Student student5 = ac.getBean("s5", Student.class);
		System.out.println(student5);
		Student student6 = ac.getBean("s6", Student.class);
		System.out.println(student6);
		Teacher t1 = ac.getBean("t1", Teacher.class);
		System.out.println(t1);
		Teacher t2 = ac.getBean("t2", Teacher.class);
		System.out.println(t2);
		Teacher t3 = ac.getBean("t3", Teacher.class);
		System.out.println(t3);
		Teacher t4 = ac.getBean("t4", Teacher.class);
		System.out.println(t4);
	}

}
