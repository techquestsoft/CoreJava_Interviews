package com.hi.collections;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Hashtable;

public class MapExp implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args){
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		ht.put("a1", 1);
		ht.put("a2", 1);
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>(17);
		hm.put("a1", 1);
		hm.put("a2", 1);
	}

}
