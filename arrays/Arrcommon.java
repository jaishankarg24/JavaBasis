package com.java1.basic.javaprogm.arrays;
public class Arrcommon
{
public static void main(String[] args)
{
int ar1[]={10,20,30,40,50,60};
int ar2[]={20,30,55,88,70,40};
common(ar1,ar2);
}


static void common(int a[],int b[])
{
for(int i=0;i<a.length;i++)
{
for(int j=0;j<b.length;j++)
{
if(a[i]==b[j])
System.out.println(a[i]);
}
}
}
}