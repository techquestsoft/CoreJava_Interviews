package com.hi.memoryManagement;

import java.util.ArrayList;

public class V3Radiator extends V2Radiator{
	V3Radiator(ArrayList list) {
		super(list);
		for (int x = 0; x < 5; x++) {
			list.add(new SimUnit("V3Radiator"));
		}
	}

}
