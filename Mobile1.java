package com.java1.basic;

public class Mobile1 {
	int price;
	Battery b;

	public static void main(String[] args) {
		Mobile1 m = new Mobile1();
		System.out.println(m.price);
		System.out.println(m.b);

		m.price = 5500;
		m.b = new Battery();
		System.out.println(m.price);
		System.out.println(m.b);

	}
}

//0
//null
//5500
//com.java1.basic.Battery@15db9742