package com.java1.basic.javaprogm.arrays;public class Arrocc
{
public static void main(String[] args)
{
int ar[]={34,56,78,34,34,18,34,56,12};

for(int i=0;i<ar.length;i++)
{
int c=1;
for(int j=i+1;j<ar.length;j++)
{
if(ar[i]==ar[j])
{
c++;
ar=deleteArr(ar,j);
j--;
}
}
System.out.println(ar[i]+"---->"+c);
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