package com.java1.basic.javaprogm;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner ev = new Scanner(System.in);
		System.out.println("enter the no:");
		int num = ev.nextInt();
		int rs = geteven(num);
		System.out.println("no of even digiths are:" + rs);
	}

	static int geteven(int n) {
		int c = 0;

		do {
			int r = n % 10;
			if (r % 2 == 0)
				c++;
			n = n / 10;
		} while (n != 0);
		return c;
	}

}