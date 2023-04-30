package com.java1.basic;

public class Borewell {

	public Water pumping() {
		Water w = new Water();
		System.out.println(w);
		return w;
	}

	public static void main(String[] args) {
		Borewell b = new Borewell();
		Water pumping = b.pumping();
		System.out.println(pumping);
		System.out.println(b);

	}
}

//com.java1.basic.Water@15db9742
//com.java1.basic.Water@15db9742
//com.java1.basic.Borewell@6d06d69c