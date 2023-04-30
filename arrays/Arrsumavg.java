package com.java1.basic.javaprogm.arrays;import java.util.Scanner;

public class Arrsumavg {
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
		int sum=0;
		for(int i=0;i<ar.length;i++)
		
		{
			
			sum=sum+ar[i];		}
		System.out.println("sum of numbers is:"+sum);
		System.out.println("average of numbers is:"+sum/n);
	}

}