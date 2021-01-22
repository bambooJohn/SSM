package com.bambooJohn.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(0)
public class TestAspect {

	@Before(value="execution(* com.bambooJohn.spring.aop.*.*(..))")
	public void beforeMethod() {
		System.out.println("TestAspect=>前置通知");
	}
	
}
