package com.java1.basic.recursion;
public class Nthfibbonic {
public static void main(String[] args) {
	int n=5;
	int fb=fib(n);
			System.out.println(fb);
	
}

static int fib(int n)
{
	if(n==1)
		return 0;
	if(n==2)
		return 1;
	return fib(n-1)+fib(n-2);
}

}
