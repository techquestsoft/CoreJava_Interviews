package com.training.arrays;

public class DuplicateElement {
	public static void main(String[] args) {
		// Initialize array
		int[] arr = new int[] { 1, 2, 3, 4, 2, 7, 8, 8, 3, 2, 2, 3,3,3,8,8,8,8,4 };
		System.out.println("Duplicate elements in given array: ");
		int[] dup = arr.clone();
		// Searches for duplicate element
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != -1) {
				boolean duplicateFound = false;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						// System.out.println(arr[j]);
						duplicateFound = true;
						dup[j] = -1;
						arr[j] = -1;
					}
				}
				if (duplicateFound) {
					dup[i] = 1;
				} else {
					dup[i] = -1;
				}
			}
		}
		int count = 0;
		for (int i : dup) {
			//System.out.print("  " + i);

			if (i != -1) {
				System.out.println(arr[count]);
			}

			count++;
		}
	}
}
