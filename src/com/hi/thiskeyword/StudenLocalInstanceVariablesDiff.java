package com.training.thiskeyword;

public class StudenLocalInstanceVariablesDiff {
	int rollno;
	String name;
	float fee;

	StudenLocalInstanceVariablesDiff(int r,String n,float f){  
	rollno=r;  
	name=n;  
	fee=f;  
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
}

class TestThis3 {
	public static void main(String args[]) {
		StudenLocalInstanceVariablesDiff s1 = new StudenLocalInstanceVariablesDiff(111, "ankit", 5000f);
		StudenLocalInstanceVariablesDiff s2 = new StudenLocalInstanceVariablesDiff(112, "sumit", 6000f);
		s1.display();
		s2.display();
	}
}
