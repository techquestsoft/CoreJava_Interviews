package com.training.polymorphism;

public class Student {
	int id;
	String name;
	final String PAN_CARD_NUMBER; // gives compilation error if it is not initialize  in constructor

	Student() {
		PAN_CARD_NUMBER = "nafa";
		System.out.println(PAN_CARD_NUMBER);
	}
}
