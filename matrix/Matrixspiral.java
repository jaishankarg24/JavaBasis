package com.java1.basic.matrix;import java.util.Scanner;

public class Matrixspiral {
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
		for(int i=0,j=n-1; i<j; i++,j--)
		{
			for(int k=i;k<j;k++)
				System.out.print(mat[i][k]+" ");
			for(int k=i;k<j;k++)
				System.out.print(mat[k][j]+" ");
			for(int k=j;k>i;k--)
				System.out.print(mat[j][k]+" ");
			for(int k=j;k>i;k--)
				System.out.print(mat[k][i]+" ");
		}
		
		if( n%2==1)
		{
			System.out.println(mat[n/2][n/2]);
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