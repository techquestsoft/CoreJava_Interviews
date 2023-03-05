package com.training.polymorphism;

public class Bike11 {
	int cube(final int n) {
		//n = n + 2;// can't be changed as n is final
		return n;
	}

	public static void main(String args[]) {
		Bike11 b = new Bike11();
		b.cube(5);
	}
}
