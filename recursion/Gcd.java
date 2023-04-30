package com.java1.basic.recursion;import java.util.Scanner;
public class Gcd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two nos:");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int g=gcd(m,n);
		System.out.println(g);
	}
	
	static int gcd(int m,int n)
	{
		if(m>n)
			return gcd(n,m);
		if(m==0)
			return n;
		return gcd(n%m,m);
	}

}
