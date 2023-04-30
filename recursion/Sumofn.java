package com.java1.basic.recursion;
public class Sumofn {
public static void main(String[] args) {
	int n=5;
	System.out.println("sum of " + n + "natural nos are:");
	 int sum=sumofn(n);
	 System.out.println(sum);
}

static int sumofn(int n)
{
	System.out.println(n);
	if(n==1)
		return 1;
		return n+sumofn(n-1);
	
}
}
