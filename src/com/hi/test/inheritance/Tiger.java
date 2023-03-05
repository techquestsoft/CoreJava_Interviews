package com.hi.test.inheritance;

public class Tiger extends Feline {
	Tiger(int i){
		System.out.println(" i am tiger constructor");
	}

	@Override
	public void roam() {
		System.out.println("calling Tiger roam===");


	}

	@Override
	public void beFriendly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beNotFriendly() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void testSuper() {
		super.testSuper();
		
		System.out.println("calling test super tiger===");


	}

}
