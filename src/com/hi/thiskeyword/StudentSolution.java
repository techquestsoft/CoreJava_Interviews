package com.training.thiskeyword;

public class StudentSolution {
	int rollno;
	String name;
	float fee;

	StudentSolution(int rollno,String name,float fee){  
	this.rollno=rollno;  
	this.name=name;  
	this.fee=fee;  
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
}



