package com.java1.basic;

public class Music1 {
	String brand;
	Cd c;

	public static void main(String[] args) {
		Music1 m = new Music1();
		System.out.println(m.brand);
		System.out.println(m.c);
		
		m.brand = "Sony";
		m.c = new Cd();
		System.out.println(m.brand);
		System.out.println(m.c);
	}
}
//null
//null
//Sony
//com.java1.basic.Cd@15db9742
