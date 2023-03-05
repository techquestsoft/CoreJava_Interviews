package com.training.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThirdLargestInArrayExample2 {
	public static int getThirdLargest(Integer[] a, int total) {
		List<Integer> list = Arrays.asList(a);
		Collections.sort(list);
		int element = list.get(total - 3);
		return element;
	}

	public static void main(String args[]) {
		Integer a[] = { 1, 2, 5, 6, 3, 2 };
		Integer b[] = { 44, 66, 99, 77, 33, 22, 55 };
		System.out.println("Third Largest1: " + getThirdLargest(a, a.length));
		System.out.println("Third Largest1: " + getThirdLargest(b, b.length));
	}
}
