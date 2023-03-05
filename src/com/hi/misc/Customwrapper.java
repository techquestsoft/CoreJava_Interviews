package com.training.misc;

//Creating the custom wrapper class  
class Customwrapper {
	private int i;

	Customwrapper() {
	}

	Customwrapper(int i) {
		this.i = i;
	}

	public int getValue() {
		return i;
	}

	public void setValue(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return Integer.toString(i);
	}
}
