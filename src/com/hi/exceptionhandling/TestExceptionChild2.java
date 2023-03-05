package com.training.exceptionhandling;

class TestExceptionChild2 extends Parent1 {
	// Compile Time error
	/*
	 * void msg() throws Exception { System.out.println("child"); }
	 */

	public static void main(String args[]) {
		Parent1 p = new TestExceptionChild2();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}