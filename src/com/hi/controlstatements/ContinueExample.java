package com.training.controlstatements;

public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for loop
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				// using continue statement
				continue;// it will skip the rest statement
			}
			System.out.println(i);
		}
	}

	//As you can see in the above output, 5 is not printed on the console. It is because the loop is continued when it reaches to 5.
}
