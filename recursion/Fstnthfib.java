package com.java1.basic.recursion;import java.util.Scanner;
public class Fstnthfib {
public static void main(String[] args) {
	System.out.println("enter the no:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	for(int i=1;i<=n;i++)
	{
		
		System.out.print(fib(i));
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

}
