package com.training.abstraction;

public abstract class Bike1 {
	Bike1() {
		System.out.println("bike is created");
	}

	abstract void run();

	void changeGear() {
		System.out.println("gear changed");
	}
}
