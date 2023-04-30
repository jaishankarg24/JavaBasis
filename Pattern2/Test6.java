package com.java1.basic.javaprogm;

public class Test6 {
	public static void main(String[] args) {
		String st = "RAGHU";
		for (int i = 0; i < st.length(); i++) {
			for (int j = 0; j < st.length(); j++) {
				if (i == 0)
					System.out.print(st.charAt(j) + " ");
				else if (i == 1 && j == 1)
					System.out.print(st.charAt(j - 1) + " ");

				else if (i == 1 && j == 2)
					System.out.print(st.charAt(j - 1) + " ");

				else if (i == 1 && j == 3)
					System.out.print(st.charAt(j - 1) + " ");

				else if (i == 1 && j == 4)
					System.out.print(st.charAt(j - 1) + " ");

				else if (i == 2 && j == 2)
					System.out.print(st.charAt(j - 2) + " ");

				else if (i == 2 && j == 3)
					System.out.print(st.charAt(j - 2) + " ");

				else if (i == 2 && j == 4)
					System.out.print(st.charAt(j - 2) + " ");

				else if (i == 3 && j == 3)
					System.out.print(st.charAt(j - 3) + " ");

				else if (i == 3 && j == 4)
					System.out.print(st.charAt(j - 3) + " ");

				else if (i == 4 && j == 4)
					System.out.print(st.charAt(j - 4) + " ");

				else
					System.out.print("  ");
			}

			System.out.println();
		}
	}
}