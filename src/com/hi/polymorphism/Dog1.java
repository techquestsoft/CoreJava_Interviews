package com.training.polymorphism;

public class Dog1 extends Animal {
	static void method(Animal a) {
		if (a instanceof Dog1) {
			Dog1 d = (Dog1) a;// downcasting
			System.out.println("ok downcasting performed");
		}
	}

	public static void main(String[] args) {
		Animal a = new Dog1();
		Dog1.method(a);
	}

}