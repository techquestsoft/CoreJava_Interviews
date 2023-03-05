package com.training.thiskeyword;

class C {
	C getC() {
		return this;
	}

	void msg() {
		System.out.println("Hello java");
	}
}

class Test1 {
	public static void main(String args[]) {
		new C().getC().msg();
	}
}
