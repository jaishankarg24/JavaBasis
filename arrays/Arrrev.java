package com.java1.basic.javaprogm.arrays;public class Arrrev {
	public static void main(String[] args) {
		int ar[]={20,30,35,45,72};
		System.out.println("before reverse");
		dispArr(ar);
	reverse(ar);
	System.out.println("after reverse");
	dispArr(ar); 
		}
		private static void reverse(int[] ar) {
			for(int i=0;i<ar.length/2;i++)
			{
				int t=ar[i];
				ar[i]=ar[ar.length-1-i];
				ar[ar.length-1-i]=t;
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