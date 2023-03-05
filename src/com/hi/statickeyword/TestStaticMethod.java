package com.training.statickeyword;

//Test class to create and display the values of object  
public class TestStaticMethod {
	public static void main(String args[]) {
		StudentStaticMethod.change();// calling change method
		// creating objects
		StudentStaticMethod s1 = new StudentStaticMethod(111, "Karan");
		StudentStaticMethod s2 = new StudentStaticMethod(222, "Aryan");
		StudentStaticMethod s3 = new StudentStaticMethod(333, "Sonoo");
		// calling display method
		s1.display();
		s2.display();
		s3.display();
	}
}