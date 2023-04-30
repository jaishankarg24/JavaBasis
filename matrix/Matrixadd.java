package com.java1.basic.matrix;import java.util.Scanner;

public class Matrixadd
{
	public static void main(String[] args)
	{
		int a[][]=readmat();
		int b[][]=readmat();
		System.out.println("first matrix elements");
		dispmat(a);
		System.out.println("second matrix element");
		dispmat(b);
		int s[][]=addmat(a,b);
		if(s!=null)
		{
			System.out.println("added matrix elements");
			dispmat(s);
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
	
	public static int[][]addmat(int[][] a,int[][] b)
	{
		if(a.length==b.length&&a[0].length==b[0].length)
		{
			for (int i = 0; i < b.length; i++)
			{
				for (int j = 0; j < b[i].length; j++)
				{
					a[i][j]+=b[i][j];
				}
			}
			return a;
		}
		return null;
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
