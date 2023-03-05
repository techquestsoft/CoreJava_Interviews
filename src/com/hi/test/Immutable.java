package com.hi.test;

public class Immutable {
	public static void main(String[] args){
		String s1 = "abc4";
		String s2 = "abc"+"4";
		String s3 = "abc" + s1.length();
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1==s3);
	}
}
