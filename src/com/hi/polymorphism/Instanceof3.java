package com.training.polymorphism;

public class Instanceof3 {
	public static void main(String args[]) {
		Dog d = null;
		System.out.println(d instanceof Animal);// false
		System.out.println(d instanceof Dog);// false
		Dog d1=(Dog)new Animal();  
		//Compiles successfully but ClassCastException is thrown at runtime  
	}
}
