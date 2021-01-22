package com.bambooJohn.spring.aopxml;

import org.springframework.stereotype.Component;

@Component
public class MyLogger {

	
	public void before() {
		System.out.println("xml=>前置通知");
	}
	
}
