package com.java1.basic.buffer;

public class Sample {
	public static void main(String[] args) {

		long initialTime = System.currentTimeMillis();

		System.out.println(initialTime);

		StringBuffer s = new StringBuffer("hello");
		for (int i = 0; i < 1000000; i++) {
			s = s.append("world");
		}
		System.out.println(System.currentTimeMillis() - initialTime);

		initialTime = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder("hello");
		for (int i = 0; i < 1000000; i++) {
			sb = sb.append("world");
		}
		System.out.println(System.currentTimeMillis() - initialTime);

	}
}
//52
//25