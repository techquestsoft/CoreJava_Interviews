package com.training.abstraction;

public interface Drawable1 {
	void draw();

	default void msg() {
		System.out.println("default method");
	}
}
