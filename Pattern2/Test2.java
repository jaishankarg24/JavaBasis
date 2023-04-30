package com.java1.basic.javaprogm;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner oc = new Scanner(System.in);
		System.out.println("enter the dec no:");
		int no = oc.nextInt();

		String o1 = dectooct(no);
		System.out.println("dec of " + no + "is" + o1);

	}

	static String dectooct(int n) {
		String oct = "";
		while (n > 0) {
			int r = n % 8;
			if (r < 10)
				oct = r + oct;
			else
				oct = (char) (r + 55) + oct;
			n = n / 8;
		}
		return oct;
	}
}