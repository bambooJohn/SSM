package com.bambooJohn.ioc.proxy;

public class MyLogger {

	public static void before(String methodName,String args) {
		System.out.println("method:" + methodName+",arguments:" + args);
	}
	
	public static void after(String methodName,Object result) {
		System.out.println("method:" + methodName+",result:" + result);
	}
	
	public static void throwing() {
		System.out.println("异常了。。。");
	}
	
}
