package com.java1.basic.matrix;


public class Matrix {
	public static void main(String[] args) {
		int a[][]={{10,20,30},{23,45,67,89},{67,78,90}};
		System.out.println("matrix element");
		dispmat(a);
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
