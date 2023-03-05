package com.training.polymorphism;

public class Honda extends Bike9 {
	// Compilation error cannot overwrite final method
	/*
	 * void run1() { System.out.println("running safely with 100kmph"); }
	 */
	public static void main(String args[]) {
		Honda honda = new Honda();
		honda.run();
	}
}
