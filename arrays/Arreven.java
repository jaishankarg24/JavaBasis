package com.java1.basic.javaprogm.arrays;public class Arreven
{
public static void main(String[] args)
{
int ar[]={28,45,78,6,91,33,7,5};

int c[]=new int[2];
for(int i=0;i<ar.length;i++)
{
c[ar[i]%2]++;
}

System.out.println("no of even no"+ c[0]);
System.out.println("no of odd no"+ c[1]);
}
}