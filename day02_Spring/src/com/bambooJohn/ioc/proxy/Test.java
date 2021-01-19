package com.bambooJohn.ioc.proxy;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MathImpl mathImpl = new MathImpl();
		int i = 2;
		int j = 3;
		System.out.println("i+j:" + mathImpl.add(i, j));
		
		MathI proxyInstance = (MathI)new ProxyFactory(mathImpl).getProxyInstance();
		proxyInstance.mul(i, j);
	}

}
