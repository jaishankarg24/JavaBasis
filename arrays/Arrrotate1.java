package com.java1.basic.javaprogm.arrays;public class Arrrotate1
{
public static void main(String[] args)
{
int ar[]={28,42,56,78,90,12};

rotate(ar,2);
for(int i=0;i<ar.length;i++)
{
System.out.println(ar[i]+" ");
}

}

static void rotate(int ar[],int pos)
{
while(pos>0)
{

int t=ar[0];
for(int i=1;i<=ar.length; i++)
{
int t1=ar[ar.length-i];
ar[ar.length-i]=t;
t=t1;
}
pos--;

}
}

}
