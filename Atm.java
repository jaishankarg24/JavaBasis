package com.java1.basic;

public class Atm {
	String bankname = "SBI";

	public Money dispence() {
		Money m = new Money();
		System.out.println(m);
		return m;

	}

	public static void main(String[] args) {
		Atm a = new Atm();
		a.dispence();
	}
}
