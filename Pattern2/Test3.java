package com.java1.basic.javaprogm;

public class Test3 {
	public static void main(String[] args) {
		int count = 0;
		for (int n = 1; n <= 1000; n++) {
			boolean r = isStrong(n);

			if (r) {
				System.out.println(n + "is a strong no");
				count++;
			}
		}
		System.out.println("no of strong no bw 1 to 1000 are:" + count);
	}

	static boolean isStrong(int no) {
		int sum = 0;
		int t = no;
		while (no != 0) {
			int rs = no % 10;
			sum = sum + fact(rs);
			no = no / 10;
		}
		return t == sum;
	}

	static int fact(int n) {
		int fc = 1;
		while (n > 0) {
			fc = fc * n;
			n--;
		}

		return fc;
	}

}
