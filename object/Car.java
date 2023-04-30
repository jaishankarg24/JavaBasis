package com.java1.basic.object;

public class Car {
	String regnum;
	String colour;
	int capacity;

	Car(String regnum, String colour, int capacity) {
		this.regnum = regnum;
		this.colour = colour;
		this.capacity = capacity;
	}

	public static void main(String[] args) {
		Car c1 = new Car("DL345L", "black", 250);
		System.out.println(c1.regnum);
		System.out.println(c1.colour);
		System.out.println(c1.capacity);
		System.out.println("..........................................");
		Car c2 = new Car("KA123D", "Blue", 250);
		System.out.println(c2.regnum);
		System.out.println(c2.colour);
		System.out.println(c2.capacity);

	}

}
