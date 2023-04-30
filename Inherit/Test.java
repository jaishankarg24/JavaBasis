package com.java1.basic.Inherit;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("cooking starts");
		Shop s = new Shop();
		Vegetable v = s.sell();

		if (v instanceof Carrot) {
			//parent type to child type casting
			Carrot c = (Carrot) v;
			c.prepareHalwa();
		} else if (v instanceof Chilly) {
			Chilly c1 = (Chilly) v;
			c1.prepareBajji();
		} else {
			Potato p = (Potato) v;
			p.prepareWafers();
		}
		System.out.println("cooking ends");
	}

}

//cooking starts
//wafers prepared
//cooking ends