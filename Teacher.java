package com.java1.basic;


public class Teacher {
	String name="Shishira";

	public Penp givespen()
	{
		Penp p = new Penp();
		System.out.println("teacher "+ this.name+ " gives "+p.color + " color pen");
		return p;
	}

	public static void main(String[] args) {
		Teacher t=new Teacher();
		t.givespen();
	}
}
//teacher Shishira gives red color pen
