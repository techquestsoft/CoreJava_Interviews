package com.hi.test.inheritance;

public class AnimalTestDrive {
	public static void main(String[] args) {
		MyAnimalList list = new MyAnimalList();
		Lion a = new Lion();
		Tiger c = new Tiger(1);
		/*list.add(a);
		list.add(c);*/
		/*Feline dog = new Dog();
		dog.roam();
		Object o = new Dog();*/
		
		Tiger tiger  = new Tiger(2);
		tiger.testSuper();
	}
}
