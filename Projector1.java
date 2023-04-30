package com.java1.basic;


public class Projector1 {
	int price;
	Lens l ;
	boolean val;

	public static void main(String[] args) {
		Projector1 p=new Projector1();
		System.out.println(p.price);
		System.out.println(p.l);
		System.out.println(p.val);
		p.price=50000;
		p.l=new Lens();
		System.out.println(p.price);
		System.out.println(p.l);
	}
}
//0
//null
//false
//50000
//com.java1.basic.Lens@15db9742