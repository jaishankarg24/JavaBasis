package com.java1.basic;

public class Mobile {
	String model ;
	String color;
	
	public void sendmessage() {
		System.out.println("send message");
	}
	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		m1.model = "iphone";
		m1.color = "white";

		Mobile m2 = new Mobile();
		m2.model = "gionee";
		m2.color = "gery";

		System.out.println(m1.model);
		System.out.println(m1.color);
		m1.sendmessage();

		System.out.println(m2.model);
		System.out.println(m2.color);		
		m2.sendmessage();
	}
}