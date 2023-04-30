package com.java1.basic.matrix;import java.util.Scanner;
public class Matrixuser1 
{
	public static void main(String[] args)
	{
		int mat1[][]=readmat();
		int mat2[][]=readmat();
		System.out.println("entered first matrix");
		dispmat(mat1);
		System.out.println("entered second matrix");
		dispmat(mat2);
	}

	private static int[][] readmat()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter no of rows and columns");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int mat[][];  //declaration
		mat=new int[row][col];  //allocation
		System.out.println("enter " + row*col + " element");
		for(int  i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		return mat;

	}



	static void dispmat(int[][] a)
	{
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}