package com.java1.basic.javaprogm.arrays;

import java.util.Scanner;
class Arr2co
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the how many integer values you have:");
int n=sc.nextInt();
int ar[]=new int[n];
System.out.println("enter those"+n+"values:");
for(int i=0;i<ar.length;i++)
{
ar[i]=sc.nextInt();
}

int td=0;
for(int i=0;i<ar.length;i++)
{
if(ar[i]>9&&ar[i]<100 || ar[i]<-9&&ar[i]>-100)
td++;
}
System.out.println("no of 2 digit no:"+td);
}
}