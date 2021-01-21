package com.bambooJohn.spring.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
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
	//@Before(value="execution(public int com.bambooJohn.spring.aop.MathImpl.add(int, int))")
	@Before(value="execution(* com.bambooJohn.spring.aop.*.*(..))")
	public void beforeMethod(JoinPoint joinPoint) {
		Object[] args = joinPoint.getArgs();//获取方法参数
		String methodName = joinPoint.getSignature().getName();//获取方法名
		System.out.println("methid:" + methodName + ",arguments:" + Arrays.toString(args));
	}
	
}
