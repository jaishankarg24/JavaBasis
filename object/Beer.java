package com.java1.basic.object;

public class Beer {
	String brand;
	int price;
	String flavor;

	Beer(String brand, int price, String flavor) {
		this.brand = brand;
		this.price = price;
		this.flavor = flavor;
	}

	public static void main(String[] args) {
		Beer b1 = new Beer("Corona", 2000, "grape");
		System.out.println(b1.brand);
		System.out.println(b1.price);
		System.out.println(b1.flavor);
		System.out.println("..........................................");
		Beer b2 = new Beer("antiquity blue", 3000, "berry");
		System.out.println(b2.brand);
		System.out.println(b2.price);
		System.out.println(b2.flavor);

	}

}