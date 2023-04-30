package com.java1.basic.recursion;
public class Productofn {
public static void main(String[] args) {
	int n=5;
	System.out.println("product of " + n + "natural nos are:");
	 int product=proofn(n);
	 System.out.println(product);
}

static int proofn(int n)
{
	
	if(n==1 || n==0)
		return 1;
		return n*proofn(n-1);
	
}
}
