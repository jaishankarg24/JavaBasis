package com.java1.basic.javaprogm.arrays;import java.util.Scanner;
public class Arrcomb
{
public static void main(String []args)
{
System.out.println("1st array elements:");
int ar1[]=readArr();
System.out.println("2nd array elements:");
int ar2[]=readArr();
int rs[]=Combine(ar1,ar2);
System.out.println("after combine:");
dispArr(rs);
}


static int[] readArr()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the value:");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter"+n+"values");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
return a;
}


static int[] Combine(int a[],int b[])
{
int rs[]=new int[a.length+b.length];
for(int i=0;i<a.length;i++)
{
rs[i]=a[i];
}
for(int i=0;i<b.length;i++)
{
rs[a.length+i]=b[i];
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