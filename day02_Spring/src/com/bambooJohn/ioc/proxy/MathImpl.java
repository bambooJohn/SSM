package com.bambooJohn.ioc.proxy;

public class MathImpl implements MathI {

	@Override
	public int add(int i, int j) {
		// TODO Auto-generated method stub
		return i + j;
	}

	@Override
	public int sub(int i, int j) {
		// TODO Auto-generated method stub
		return i - j;
	}

	@Override
	public int mul(int i, int j) {
		// TODO Auto-generated method stub
		return i * j;
	}

	@Override
	public int div(int i, int j) {
		// TODO Auto-generated method stub
		return i / j;
	}

}
