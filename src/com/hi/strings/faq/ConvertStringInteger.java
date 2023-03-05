package com.training.strings.faq;

public class ConvertStringInteger {
	public static void main(String[] args) {
		// 1st way
		String str1 = "5";
		int result = Integer.parseInt(str1); // Using Integer.parsrInt()
		System.out.println(result);

		// 2nd way
		String str2 = "5";
		Integer result2 = Integer.valueOf(str2); // Using Integer.valueOf()
		System.out.println(result2);

		int x =12;
		// 1st way
		String str3 = Integer.toString(x); // using Integer.toString()
		System.out.println(str3);

		// 2nd way
		String str4 = String.valueOf(x); // using String.valueOf()
		System.out.println(str4);

	}
}
