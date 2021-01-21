package com.bambooJohn.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect // 标注当前类为前面
public class MyLogger {

	/*
	 * @Before:将方法指定为前置通知
	 * 必须设置value，其值为切入点表达式
	 */
	@Before(value="execution(public int com.bambooJohn.spring.aop.MathImpl.add(int, int))")
	public void beforeMethod() {
		System.out.println("方法执行之前");
	}
	
}