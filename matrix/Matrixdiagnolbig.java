package com.java1.basic.matrix;import java.util.Scanner;

public class Matrixdiagnolbig
{
	public static void main(String[] args) {
		int a[][]=readmat();
		System.out.println("eneter the matrix elements");
		dispmat(a);
		int big=getbiggest(a);
		System.out.println("the biggest element"+big);
		int diabig=getbiggestdiagonal(a);
		System.out.println("the biggest diagonal element"+diabig);
	}

	private static int getbiggest(int[][] a) 
	{
		int big=a[0][0];
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				if(a[i][j]>big)
					big=a[i][j];
			}
		}
		return big;
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
	private static int getbiggestdiagonal(int [][]a)
	{
		int diabig=a[0][0];
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				if(i==j)
				{
					if(a[i][j]>diabig)
						diabig=a[i][j];
				}
			}
		}

		return diabig;
	}

}
