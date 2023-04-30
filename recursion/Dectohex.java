package com.java1.basic.recursion;
public class Dectohex {
public static void main(String[] args) {
	int n=25;
	System.out.println("decimal to hexadecimal is:");
	 dectohex(n);
	 
}

static void  dectohex(int n)
{
	
	if(n!=0)
		dectohex(n/16);
	int r=n%16;
	if(r<10)
		System.out.print(r);
	else
	System.out.print((char)(55+r));

	
}
}
