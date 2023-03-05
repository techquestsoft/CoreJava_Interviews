package com.training.polymorphism;

public class InitializerChild extends InitializerParent {
	InitializerChild() {
		super();
		System.out.println("child class constructor invoked");
	}

	{
		System.out.println("instance initializer block is invoked");
	}

	public static void main(String args[]) {
		InitializerChild b = new InitializerChild();
	}
}
