package com.training.misc;

class Operation {
	int data = 50;

	void change(int data) {
		data = data + 100;// changes will be in the local variable only
		System.out.println("changed value : "+data);
	}

	public static void main(String args[]) {
		Operation op = new Operation();
		int data1 = 100;
		System.out.println("before change " + data1);
		op.change(data1);
		System.out.println("after change " + data1);

	}
}
