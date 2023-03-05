package com.training.statickeyword;

//Java Program to demonstrate the use of static variable  
class StudentStaticVariable {
	int rollno;// instance variable
	String name;
	static String college = "ITS";// static variable
	// constructor

	StudentStaticVariable(int r, String n) {
		rollno = r;
		name = n;
	}

	// method to display the values
	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}
}
