package com.java1.basic.recursion;
public class Primefib {
public static void main(String[] args) {
	for(int i=1;fib(i)<100;i++)
	{
		boolean f=isprime(fib(i),2);
		if(f)
		
		System.out.println(fib(i) + " is prime");
		
	}
}

static int fib(int n)
{
	if(n==1)
		return 0;
	if(n==2)
		return 1;
	return fib(n-1)+fib(n-2);
}

static boolean isprime(int n,int i )
{
if(i>n/2)
	return true;
else 
{
	if(n%i==0)
		return false;
}
	return isprime(n,i+1);	
}
}
