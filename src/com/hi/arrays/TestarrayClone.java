package com.training.arrays;

public class TestarrayClone {
	public static void main(String args[]) {
		int arr[] = { 33, 3, 4, 5 };
		System.out.println("Printing original array:");
		for (int i : arr)
			System.out.println(i);

		System.out.println("Printing clone of the array:");
		int carr[] = arr.clone();
		for (int i : carr)
			System.out.println(i);

		System.out.println("Are both equal?");
		System.out.println(arr == carr);
		
		System.out.println("----------------------------------------------");
		int arr1[][] ={ { 33, 3, 4, 5 },{ 33, 3, 4, 5 }}; // 2 rows 4 columns

		System.out.println("Printing original array:" );
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Printing clone of the array:");
		int carr1[][] = arr1.clone();
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(carr1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Are both equal?");
		System.out.println(arr1 == carr1);

	}
}
