package com.bambooJohn.ioc.proxy;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MathImpl mathImpl = new MathImpl();
		
		MathI proxyInstance = (MathI)new ProxyUtil(mathImpl).getProxyInstance();
		proxyInstance.div(4, 1);
	}

}
