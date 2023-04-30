package com.java1.basic.Inherit;

import java.util.Random;

public class Shop {

	Vegetable sell() {
		Random r = new Random();
		System.out.println(r.toString());
		
		int rn = r.nextInt(3);
		System.out.println(rn);
		
		if (rn == 0) {
			return new Carrot();
		} else if (rn == 1) {
			return new Chilly();
		} else {
			return new Potato();
		}
	}

}
