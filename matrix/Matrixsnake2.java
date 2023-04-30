package com.java1.basic.matrix;import java.util.Scanner;

public class Matrixsnake2{
	public static void main(String[] args) {
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
		System.out.println("matrix is:");
		dispmat(mat);
		
		int n=row;
		for(int j=0;j<n;j++)
		{
			if(j%2==0)
			{
				for(int i=0;i<n;i++)
					System.out.print(mat[i][j]+" ");
			}
			else
			{
				for(int i=n-1;i>=0;i--)
					System.out.print(mat[i][j]+" ");
			}
		}
		
		
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