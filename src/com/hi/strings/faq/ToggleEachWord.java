package com.training.strings.faq;

public class ToggleEachWord {
	public static String toggle(String str) {
		String words[] = str.split("\\s");
		String toggle = "";
		for (String w : words) {
			String first = w.substring(0, 1);
			String afterfirst = w.substring(1);
			toggle += first.toLowerCase() + afterfirst.toUpperCase() + " ";
		}
		return toggle.trim();
	}
}
