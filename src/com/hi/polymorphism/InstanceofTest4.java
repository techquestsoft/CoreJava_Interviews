package com.training.polymorphism;

public class InstanceofTest4 {
	public static void main(String args[]) {
		Printable p = new B();
		Call c = new Call();
		c.invoke(p);
	}
}
