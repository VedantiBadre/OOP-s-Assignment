package com.oops.Abstract;

public abstract class ClassC extends ClassB{

	@Override
	void mul(int a,int b) {
		int c=a*b;
		System.out.println("Mult of 2 digit :"+c);
	}
	abstract void div(int a,int b);
}

