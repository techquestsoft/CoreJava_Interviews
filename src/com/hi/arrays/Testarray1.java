package com.training.arrays;

//Java Program to illustrate the use of declaration, instantiation   
//and initialization of Java array in a single line  
class Testarray1 {
	public static void main(String args[]) {
		int a[] = { 33, 3, 4, 5 };// declaration, instantiation and initialization
		// printing array
		for (int i = 0; i < a.length; i++)// length is the property of array
			System.out.println(a[i]);
		
		for(int i:a) {  
			System.out.println(i);  
		}
	}
}