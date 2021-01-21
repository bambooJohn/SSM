package com.bambooJohn.spring.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect // 标注当前类为前面
public class MyLogger {

	/*
	 * @Before:将方法指定为前置通知
	 * 必须设置value，其值为切入点表达式
	 * @Before(value="execution(* com.bambooJohn.spring.aop.*.*(..))")
	 * 第一个*代表任意的访问修饰符和返回值类型
	 * 第二个*代表任意类
	 * 第三个*代表类中的任意方法
	 * ..代表任意的参数列表
	 * 
	 */
	//@Before(value="execution(public int com.bambooJohn.spring.aop.MathImpl.add(int, int))")
	@Before(value="execution(* com.bambooJohn.spring.aop.*.*(..))")
	public void beforeMethod(JoinPoint joinPoint) {
		Object[] args = joinPoint.getArgs();//获取方法参数
		String methodName = joinPoint.getSignature().getName();//获取方法名
		System.out.println("methid:" + methodName + ",arguments:" + Arrays.toString(args));
	}
	
	/*
	 * @After:将方法标注为后置通知
	 * 后置通知：作用于方法的finally语句块，即不管有没有异常都会执行
	 */
	@After(value="execution(* com.bambooJohn.spring.aop.*.*(..))")
	public void afterMethod() {
		System.out.println("后置通知");
	}
}
