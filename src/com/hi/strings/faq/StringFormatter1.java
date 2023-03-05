package com.training.strings.faq;

public class StringFormatter1 {
	public static String reverseString(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return sb.toString();
	}
}
