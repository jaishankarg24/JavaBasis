package com.java1.basic.matrix;import java.util.Scanner;

public class Matrixrowrev {
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
		revrow(mat);
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
	
	static void revrow(int[][] a)
	{
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length/2; j++)
			{
				int temp=a[i][j];
				a[i][j]=a[i][a[i].length-1-j];
				a[i][a[i].length-1-j]=temp;
				
			}
			
		}
		System.out.println("reverse matrix is:");
		dispmat(a);
	}
} 