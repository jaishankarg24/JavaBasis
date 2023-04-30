package com.java1.basic.javaprogm.arrays;public class Arrocc1
{
public static void main(String[] args)
{
int ar[]={28,56,78,28,26,56,28};

int c[]=new int[79];
for(int i=0;i<ar.length;i++)
{
c[ar[i]]++;
}

for(int i=0;i<c.length;i++)
{
if(c[i]!=0)
System.out.println(i+"--->"+c[i]);
}
}
}