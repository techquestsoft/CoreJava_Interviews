package com.training.polymorphism;

class TestPolymorphism2 {
	public static void main(String args[]) {
		Shape s;
		s = new Rectangle();
		s.draw();
		s = new Circle();
		s.draw();
		s = new Triangle();
		s.draw();
	}
}