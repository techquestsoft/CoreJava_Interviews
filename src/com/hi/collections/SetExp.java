package com.hi.collections;

import java.util.HashSet;
import java.util.Set;

public class SetExp {
	public static void main(String[] args){
		String s1  = new String("abc");
		String s2  = new String("ab" + "c");
		Set setSample = new HashSet();
		setSample.add(s1);
		setSample.add(s2);
		System.out.println(setSample);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.intern());
		//System.out.println(s2.intern());
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
	}
}
