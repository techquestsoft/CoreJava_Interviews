package com.training.objectsandclasses;

//Java Program to illustrate the use of Rectangle class which  
//has length and width data members  
class Rectangle1 {
	int length;
	int width;

	void insert(int l, int w) {
		length = l;
		width = w;
	}

	void calculateArea() {
		System.out.println(length * width);
	}
}

class TestRectangle2 {
	public static void main(String args[]) {
		Rectangle1 r1 = new Rectangle1(), r2 = new Rectangle1();// creating two objects
		r1.insert(11, 5);
		r2.insert(3, 15);
		r1.calculateArea();
		r2.calculateArea();
	}
}