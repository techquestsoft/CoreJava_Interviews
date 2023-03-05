package com.training.polymorphism;

public class Call {
	void invoke(Printable p) {// upcasting
		if (p instanceof A) {
			A1 a = (A1) p;// Downcasting
			a.a();
		}
		if (p instanceof B) {
			B b = (B) p;// Downcasting
			b.b();
		}

	}
}
