package com.training.thiskeyword;

public class ParameterizedConstructorFromDefaultConstructor {

	ParameterizedConstructorFromDefaultConstructor(){  
		this(5);  
		System.out.println("hello a");  
		}

	ParameterizedConstructorFromDefaultConstructor(int x){  
		System.out.println(x);  
		}
}

class TestThis6 {
	public static void main(String args[]) {
		ParameterizedConstructorFromDefaultConstructor a = new ParameterizedConstructorFromDefaultConstructor();
	}
}