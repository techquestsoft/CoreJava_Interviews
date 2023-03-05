package com.training.polymorphism;

// compilation error : cannot subclass final class
public class Honda1 {//extends //Bike1{  

	void run() {
		System.out.println("running safely with 100kmph");
	}

	public static void main(String args[]) {
		Honda1 honda = new Honda1();
		honda.run();
	}
}
