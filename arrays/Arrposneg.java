package com.java1.basic.javaprogm.arrays;
import java.util.Scanner;

public class Arrposneg {
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
		int nc=0;
		int pc=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<0)
				nc++;
			else
				pc++;
		}

		System.out.println("no of negative numbers:"+nc++);
		System.out.println("no of positive numbers:"+pc++);






	}

}

