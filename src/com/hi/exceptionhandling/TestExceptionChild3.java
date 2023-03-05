package com.training.exceptionhandling;

class TestExceptionChild3 extends Parent2 {
	void msg() throws Exception {
		System.out.println("child");
	}

	public static void main(String args[]) {
		Parent2 p = new TestExceptionChild3();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}
