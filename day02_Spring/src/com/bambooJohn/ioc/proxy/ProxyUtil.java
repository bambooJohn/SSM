package com.bambooJohn.ioc.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyUtil {

	private MathImpl mathImpl;

	public ProxyUtil(MathImpl mathImpl) {
		this.mathImpl = mathImpl;
	}
	
	public Object getProxyInstance() {
		
		ClassLoader loader = this.getClass().getClassLoader();
		Class<?>[] interfaces = mathImpl.getClass().getInterfaces();
		return Proxy.newProxyInstance(loader, interfaces, new InvocationHandler() {
			
			//代理对象实现功能的方式
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				// TODO Auto-generated method stub
				try {
					MyLogger.before(method.getName(), Arrays.toString(args));
					Object returnVal = method.invoke(mathImpl, args);//动态代理对象实现功能
					MyLogger.after(method.getName(), returnVal);
					return returnVal;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					MyLogger.throwing();
					e.printStackTrace();
				} finally {
					System.out.println("哪都有我!");
				}
				return null;
			}
		});
	}
	
}
