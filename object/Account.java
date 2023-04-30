package com.java1.basic.object;

public class Account {
	long accntnum;
	String name;
	double balance;
	String type;

	Account(long accntnum, String name, double balance, String type) {
		this.accntnum = accntnum;
		this.name = name;
		this.balance = balance;
		this.type = type;
	}

	public static void main(String[] args) {
		Account a1 = new Account(12345l, "Shishira", 200000.34, "Savings");
		System.out.println(a1.accntnum);
		System.out.println(a1.name);
		System.out.println(a1.balance);
		System.out.println(a1.type);
		System.out.println("..........................................");
		Account a2 = new Account(678945l, "Raghu", 100000.65, "Fixed deposit");
		System.out.println(a2.accntnum);
		System.out.println(a2.name);
		System.out.println(a2.balance);
		System.out.println(a2.type);

	}
}
