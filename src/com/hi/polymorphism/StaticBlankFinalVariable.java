package com.training.polymorphism;

public class StaticBlankFinalVariable {
	static final int data;// static blank final variable // gives compilation error if it is not
							// initialize in static block

	static {
		data = 50;
	}

	public static void main(String args[]) {
		System.out.println(StaticBlankFinalVariable.data);
	}
}
