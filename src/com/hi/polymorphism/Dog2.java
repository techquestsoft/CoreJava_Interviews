package com.training.polymorphism;

public class Dog2 extends Animal {
	static void method(Animal a) {
		//if (a instanceof Animal) {
			Dog2 d = (Dog2) a;// downcasting
			System.out.println("ok downcasting performed");
		//}
	}

	public static void main(String[] args) {
		Animal a = new Dog2();
		Dog2.method(a);
	}
}