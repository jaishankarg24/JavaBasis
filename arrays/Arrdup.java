package com.java1.basic.javaprogm.arrays;public class Arrdup
{
public static void main(String[] args)
{
int ar[]={28,56,78,28,25,56,28};
for(int i=0;i<ar.length;i++)
{
int c=1;
for(int j=i+1;j<ar.length;j++)
{
if(ar[i]==ar[j])
{

ar=deleteArr(ar,j);
j--;
c++;
}
}
if(c>1)
System.out.println(ar[i]);
}
}

static int[] deleteArr(int ar[],int in)
{
int[] na=new int[ar.length-1];
for(int i=0;i<na.length;i++)
{
if(i<in)
na[i]=ar[i];
else
na[i]=ar[i+1];
}
			
return na;
}
}