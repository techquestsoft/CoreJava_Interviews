package com.training.strings.faq;

public class IntToStringExample1 {
	public static void main(String args[]) {
		int i = 200;
		String s = String.valueOf(i);
		System.out.println(i + 100);// 300 because + is binary plus operator
		System.out.println(s + 100);// 200100 because + is string concatenation operator
		

		String s1=Integer.toString(i);  
		System.out.println(i+100);//300 because + is binary plus operator  
		System.out.println(s1+100);//200100 because + is string concatenation operator  
		
		String s2=String.format("%d",i);  
		System.out.println(s2);  
	}
}
