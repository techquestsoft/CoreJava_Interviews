package com.training.polymorphism;

class Dog extends Animal {
	String color = "black";

	Dog() {
		super();
		System.out.println("dog is created");
	}

	void printColor() {
		System.out.println(color);// prints color of Dog class
		System.out.println(super.color);// prints color of Animal class
	}

	void eat() {
		System.out.println("Dog eating bread...");
	}

	void bark() {
		System.out.println("Dog barking...");
	}

	void work() {
		super.eat();
		bark();
	}
}