package com.bambooJohn.ioc.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

	private MathImpl mathImpl;

	public ProxyFactory(MathImpl mathImpl) {
		this.mathImpl = mathImpl;
	}
	
	public Object getProxyInstance() {
		
		ClassLoader loader = this.getClass().getClassLoader();
		Class<?>[] interfaces = mathImpl.getClass().getInterfaces();
		return Proxy.newProxyInstance(loader, interfaces, new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				// TODO Auto-generated method stub
				//System.out.print(args[0]);
				//System.out.print("+" + args[1] + ":");
				System.out.println("method:" + method.getName()+",arguments:" + args[0] + "," + args[1]);
				Object returnVal = method.invoke(mathImpl, args);
				System.out.println("method:" + method.getName()+",result:" + returnVal);
				return returnVal;
			}
		});
	}
	
}
