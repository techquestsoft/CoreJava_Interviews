package com.training.abstraction;

//Creating a Test class which calls abstract and non-abstract methods  
class TestAbstraction2 {
	public static void main(String args[]) {
		Bike1 obj = new Honda();
		obj.run();
		obj.changeGear();
	}
}