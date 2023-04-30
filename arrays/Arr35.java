package com.java1.basic.javaprogm.arrays;import java.util.Scanner;

public class Arr35 {
	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter those "+n+"values:");

		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		int c=0;

		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%3==0&&ar[i]%5==0)
				c++;


		}

		System.out.println("no of elements divisible by 3 and 5 are:"+c);

	}
}