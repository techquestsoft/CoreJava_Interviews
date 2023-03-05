package com.training.statickeyword;

public class StudentStaticMethod {
	int rollno;
	String name;
	static String college = "ITS";

	// static method to change the value of static variable
	static void change() {
		college = "BBDIT";
	}

	// constructor to initialize the variable
	StudentStaticMethod(int r, String n){  
     rollno = r;  
     name = n;  
     }

	// method to display values
	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}
}
