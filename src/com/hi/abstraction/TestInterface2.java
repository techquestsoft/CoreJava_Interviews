package com.training.abstraction;

public class TestInterface2 {
	public static void main(String[] args) {
		Bank1 b = new SBI1();
		System.out.println("ROI: " + b.rateOfInterest());
	}
}
