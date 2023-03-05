package com.training.encapsulation.mypack;
import com.training.encapsulation.pack.A;
public class Simple extends A {
	protected void msg1() {
		System.out.println("Hello java");
	}// C.T.Error if we remove protected then C.T Error

	public static void main(String args[]) {
		Simple obj = new Simple();
		obj.msg();
	}
}
