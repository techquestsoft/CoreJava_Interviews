package com.training.exceptionhandling;

public class TestExceptionChild5 extends Parent2 {

	void msg() {
		System.out.println("child");
	}

	public static void main(String args[]) {
		Parent2 p = new TestExceptionChild5();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}
