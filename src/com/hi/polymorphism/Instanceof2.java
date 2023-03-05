package com.training.polymorphism;

public class Instanceof2 {
	public static void main(String args[]) {
		Dog d = new Dog();
		System.out.println(d instanceof Animal);// true
		System.out.println(d instanceof Dog);// true
	}
}
