package com.hi.test.inheritance;

public abstract class Feline extends Animal implements Pet{
	public abstract void roam();
	public void testSuper(){
		System.out.println("test Super in Feline===");
	}
}
