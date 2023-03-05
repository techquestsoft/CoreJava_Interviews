
package com.training.encapsulation.mypack;
//first example
//import com.training.encapsulation.pack.*;

//Second example
import com.training.encapsulation.pack.A;
class B {
	public static void main(String args[]) {
		A obj = new A();
		
		// third example
		com.training.encapsulation.pack.A obj1 = new com.training.encapsulation.pack.A();//using fully qualified name  
		
		obj.msg();
	}
}
