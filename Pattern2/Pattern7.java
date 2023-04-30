package com.java1.basic.javaprogm;import java.util.Scanner;
public class Pattern7 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
