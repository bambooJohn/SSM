package com.bambooJohn.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class MathImpl implements MathI {

	@Override
	public int add(int i, int j) {
		// TODO Auto-generated method stub
		int result = i + j;
		return i + j;
	}

	@Override
	public int sub(int i, int j) {
		// TODO Auto-generated method stub
		int result = i - j;
		return result;
	}

	@Override
	public int mul(int i, int j) {
		// TODO Auto-generated method stub
		int result = i * j;
		return result;
	}

	@Override
	public int div(int i, int j) {
		// TODO Auto-generated method stub
		int result = i / j;
		return result;
	}

}
