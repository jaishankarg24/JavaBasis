package com.java1.basic.javaprogm.arrays;public class Arrinst1 {
	public static void main(String[] args) {
	int ar[]={20,30,35,45,72,18};
	System.out.println("before insert");
	dispArr(ar);
ar=insert(insert(insert(ar,89,3),45,5),420,2);
System.out.println("after insert");
dispArr(ar); 
	}
	static int[] insert(int[] ar,int ele,int in)
	{
		if(in<0||in>ar.length)
		{
			System.out.println("error");
			System.exit(0);
		}
		int rs[]=new int[ar.length+1];
		for(int i=0;i<ar.length;i++)
		{
			if(i<in)
				rs[i]=ar[i];
			else
				rs[i+1]=ar[i];
		}
		rs[in]=ele;
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
