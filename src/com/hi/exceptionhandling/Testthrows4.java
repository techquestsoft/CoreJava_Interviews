package com.training.exceptionhandling;

import java.io.IOException;

class M2 {
	void method() throws IOException {
		throw new IOException("device error");
	}
}

class Testthrows4 {
	public static void main(String args[]) throws IOException {// declare exception
		M2 m2 = new M2();
		m2.method();

		System.out.println("normal flow...");
	}
}