package com.java1.basic.object;

public class Tree {
	double height;
	String type;

	Tree(double height, String type) {
		this.height = height;
		this.type = type;
	}

	public static void main(String[] args) {
		Tree t1 = new Tree(78.5, "Fruitgiving");
		System.out.println(t1.height);
		System.out.println(t1.type);
		System.out.println("..........................................");
		Tree t2 = new Tree(234.5, "nonfruity");
		System.out.println(t2.height);
		System.out.println(t2.type);

	}
}
