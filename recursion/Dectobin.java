package com.java1.basic.recursion;
public class Dectobin {
public static void main(String[] args) {
	int n=4;
	System.out.println("decimal to binary is:");
	 dectobin(n);
	 
}

static void  dectobin(int n)
{
	
	if(n!=0)
		dectobin(n/2);
	System.out.print(n%2);

	
}
}
