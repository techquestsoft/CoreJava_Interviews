package com.training.polymorphism;

class Honda3 extends Bike12 {
	int speedlimit = 150;

	void run() {
		System.out.println("running Honda 3");
	}
	public static void main(String args[]) {
		Bike12 obj = new Honda3();
		System.out.println(obj.speedlimit);// 90
		obj.run();
	}
}