package com.java1.basic.javaprogm;class  Pattern9
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
			System.out.print(" ");
			}
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print(j+"");
			}
			System.out.println();


	}
	}
}