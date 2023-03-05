package com.training.polymorphism;

class Adder {
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}

	static double add(double a, double b) {
		return a + b;
	}
	// Compilation error 
	/*
	 * static double add(int a, int b) { return a + b; }
	 */
}
