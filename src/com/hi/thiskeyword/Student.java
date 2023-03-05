package com.training.thiskeyword;

class Student {
	int rollno;
	String name;
	float fee;

	Student(int rollno, String name, float fee) {
		rollno = rollno;
		name = name;
		fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
}


