package com.java1.basic.recursion;
public class Displaynto1 {
public static void main(String[] args) {
	int n=10;
	System.out.println("no bw " + n + "to 1  are:");
	 disp(n);
}

static void disp(int n)
{
	System.out.println(n);
	if(n>1)
		disp(n-1);
	
}
}
