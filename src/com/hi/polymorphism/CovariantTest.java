package com.training.polymorphism;

public class CovariantTest extends Covariant {
	CovariantTest get() {
		return this;
	}

	void message() {
		System.out.println("welcome to covariant return type");
	}

	public static void main(String args[]) {
		new CovariantTest().get().message();
	}
}
