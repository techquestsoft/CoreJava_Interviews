package com.training.polymorphism;

class Emp extends Person {
	float salary;

	Emp(int id, String name, float salary) {
		super(id, name);// reusing parent constructor
		this.salary = salary;
	}

	void display() {
		System.out.println(id + " " + name + " " + salary);
	}
}