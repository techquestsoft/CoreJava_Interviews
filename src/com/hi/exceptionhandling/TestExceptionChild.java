package com.training.exceptionhandling;

class TestExceptionChild extends Parent {
	// Compile Time Error
	/*
	 * void msg() throws IOException { System.out.println("TestExceptionChild"); }
	 */
	public static void main(String args[]) {
		Parent p = new TestExceptionChild();
		p.msg();
	}
}
