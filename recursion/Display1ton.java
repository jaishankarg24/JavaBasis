package com.java1.basic.recursion;
public class Display1ton {
public static void main(String[] args) {
	int n=10;
	System.out.println("no bw 1 to" + n + " are:");
	 disp(n);
}

static void disp(int n)
{
	if(n>1)
		disp(n-1);
	System.out.println(n);
}
}
