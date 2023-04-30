package com.java1.basic.javaprogm.arrays;public class Arruniq
{
public static void main(String[] args)
{
int ar[]={28,45,56,28,56,12};

int rs[]=getunique(ar);
dispArr(rs);
}



static int[] getunique(int ar[])
{
for(int i=0;i<ar.length;i++)
{

for(int j=i+1;j<ar.length;j++)
{
if(ar[i]==ar[j])
{
ar=deleteArr(ar,j);
j--;
}
}
}
return ar;
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

static void dispArr(int a[])
{
for(int i=0;i<a.length;i++)
{
System.out.print(a[i]+" ");
}
System.out.println();
}
}