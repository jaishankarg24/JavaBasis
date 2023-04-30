package com.java1.basic.hashcode;

public class Person {
	String name;
	boolean isanemployee;

	public Person(boolean isanemployee, String name) {
		this.name = name;
		this.isanemployee = isanemployee;
	}

	@Override
	public int hashCode() {
		Boolean b = this.isanemployee;
		return b.hashCode();
	}

	public static void main(String[] args) {

		Person p1 = new Person(true, "raju");
		Person p2 = new Person(true, "raghu");
		Person p3 = new Person(false, "ramu");
		Person p4 = new Person(false, "rama");

		System.out.println("p1=" + p1.hashCode());
		System.out.println("p2=" + p2.hashCode());
		System.out.println("p3=" + p3.hashCode());
		System.out.println("p4=" + p4.hashCode());

	}
}
//p1=1231 true
//p2=1231
//p3=1237 false
//p4=1237