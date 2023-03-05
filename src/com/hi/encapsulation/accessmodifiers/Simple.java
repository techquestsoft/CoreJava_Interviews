package com.training.encapsulation.accessmodifiers;
class A {
	private int data = 40;

	private A(){}//private constructor  
	
	private void msg() {
		System.out.println("Hello java");
	}
}

public class Simple {
	public static void main(String args[]) {
		// A obj = new A(); // Compile Time Error
		//System.out.println(obj.data);// Compile Time Error
		//obj.msg();// Compile Time Error
	}
}