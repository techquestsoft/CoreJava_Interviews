package com.training.thiskeyword;

public class StudenRealUse {

	int rollno;
	String name, course;
	float fee;

	StudenRealUse(int rollno,String name,String course){  
	this.rollno=rollno;  
	this.name=name;  
	this.course=course;  
	}

	StudenRealUse(int rollno,String name,String course,float fee){  
	this(rollno,name,course);//reusing constructor  
	this.fee=fee;  
	}

	void display() {
		System.out.println(rollno + " " + name + " " + course + " " + fee);
	}
}
 class TestThis7 {
	public static void main(String args[]) {
		StudenRealUse s1 = new StudenRealUse(111, "ankit1", "java");
		StudenRealUse s2 = new StudenRealUse(112, "sumit", "java", 6000f);
		s1.display();
		s2.display();
	}
}