package com.java1.basic.javaprogm;

class Test6a {
	public static void main(String[] args) {
		String st = "RAGHU";
		for (int i = 1; i <= st.length(); i++) {

			for (int j = i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= st.length() - i; k++) {
				System.out.print(st.charAt(k));
			}
			System.out.println();
		}
	}
}