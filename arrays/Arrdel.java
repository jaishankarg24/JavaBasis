package com.java1.basic.javaprogm.arrays;public class Arrdel {
	public static void main(String[] args) {
		int ar[]={20,30,35,45,72,18};
		System.out.println("before delete");
		dispArr(ar);
	ar=delete(ar,4);
	System.out.println("after delete");
	dispArr(ar); 
		}
		static int[] delete(int[] ar,int in)
		{
			if(in<0||in>ar.length)
			{
				System.out.println("error");
				System.exit(0);
			}
			int rs[]=new int[ar.length-1];
			for(int i=0;i<rs.length;i++)
			{
				if(i<in)
					rs[i]=ar[i];
				else
					rs[i]=ar[i+1];
			}
			
			return rs;
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