package com.java1.basic.javaprogm.arrays;
public class Arrswap1 {
	public static void main(String[] args) {
		int ar[]={45,89,66,78,89,42};
		System.out.println("before reverse");
		dispArr(ar);
	reverse(ar);
	System.out.println("after reverse");
	dispArr(ar); 
		}
		private static void reverse(int[] ar) {
			for(int i=0;i<ar.length;i++)
			{
				int t=ar[i];
				ar[i]=ar[i+1];
				ar[i+1]=t;
                i++;
			}
		
		
	}
		static void dispArr(int a[])
		{
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}



}
