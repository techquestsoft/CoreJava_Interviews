package com.training.polymorphism;

public class Bike9 {
	final int speedlimit = 90;// final variable

	void run() {
		// speedlimit = 400; //Compilation error
	}

	final void run1() {
		System.out.println("running");
	}

	public static void main(String args[]) {
		Bike9 obj = new Bike9();
		obj.run();
	}
}
