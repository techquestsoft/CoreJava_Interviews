package com.training.polymorphism;

public class Splendor extends Bike10 {
	void run() {
		System.out.println("running safely with 60km");
	}

	public static void main(String args[]) {
		Bike10 b = new Splendor();// upcasting
		b.run();
	}
}
