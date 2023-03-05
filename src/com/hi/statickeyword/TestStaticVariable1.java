package com.training.statickeyword;

//Test class to show the values of objects  
public class TestStaticVariable1 {
	public static void main(String args[]) {
		StudentStaticVariable s1 = new StudentStaticVariable(111, "Karan");
		StudentStaticVariable s2 = new StudentStaticVariable(222, "Aryan");
//we can change the college of all objects by the single line of code  
//Student.college="BBDIT";  
		s1.display();
		s2.display();
	}
}
