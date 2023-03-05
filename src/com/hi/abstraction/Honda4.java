package com.training.abstraction;

public class Honda4 extends Bike {

	@Override
	void run() {
		System.out.println("Honda4 running safely");
	}

	public static void main(String args[]) {
		Bike obj = new Honda4();
		obj.run();
	}

}
