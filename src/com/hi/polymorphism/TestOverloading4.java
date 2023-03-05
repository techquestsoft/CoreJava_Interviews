package com.training.polymorphism;

class TestOverloading4 {
	 static public void main(String[] args) {
		System.out.println("main with String[]");
	}

	public static void main(String args) {
		System.out.println("main with String");
	}

	 public    void main() {
		System.out.println("main without args");
	}
}