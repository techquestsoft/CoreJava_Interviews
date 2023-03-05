package com.training.exceptionhandling;

public class TestExceptionChild4 extends Parent2 {
	void msg() throws ArithmeticException {
		System.out.println("child");
	}

	public static void main(String args[]) {
		Parent2 p = new TestExceptionChild4();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}