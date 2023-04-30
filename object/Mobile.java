package com.java1.basic.object;

public class Mobile {
	long mobilenumber;
	String model;

	Mobile(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	Mobile(String model) {
		this.model = model;
	}

	public static void main(String[] args) {
		Mobile m1 = new Mobile(874683172l);
		System.out.println(m1.mobilenumber);

		Mobile m2 = new Mobile("iPhone");
		System.out.println(m2.model);
		System.out.println("..........................................");
		Mobile m3 = new Mobile(810597285l);
		System.out.println(m3.mobilenumber);

		Mobile m4 = new Mobile("Blackberry");
		System.out.println(m4.model);

	}
}
