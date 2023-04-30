package com.java1.basic.matrix;import java.util.Scanner;

public class Matrixrowsum
{
	public static void main(String[] args) 
	{
		int a[][]=readmat();
		System.out.println("enter matrix elements");
		dispmat(a);
		disprowsum(a);
	}
	private static void disprowsum(int[][] a)
	{
		for (int i = 0; i < a.length; i++) 
		{
			int sum=0;
			for (int j = 0; j < a[i].length; j++)
			{
				sum=sum+a[i][j];
			}
			System.out.println(i+1+"row sum"  +sum);
		}


	}
	private static int[][] readmat()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no of rows and columns");
		int row=s.nextInt();
		int col=s.nextInt();
		int mat[][];
		mat=new int[row][col];
		System.out.println("enetr"+row*col+"elements");
		for (int i = 0; i < mat.length; i++)
		{
			for (int j = 0; j < mat[i].length; j++)
			{
				mat[i][j]=s.nextInt();
			}
		}

		return mat;

	}
	private static void dispmat(int[][] a) 
	{
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}


	}
}