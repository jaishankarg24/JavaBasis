package com.java1.basic.javaprogm.arrays;public class Arrcount
{
public static void main(String[] args)
{
int ar[];
ar=new int[]{22,31,45,66,75,90,88,76,99,100};

System.out.println("no of element:"+ar.length);

int ec=0,oc=0;

for(int i=0;i<ar.length;i++)
{
if(ar[i]%2==0)
ec++;
else
oc++;
}
System.out.println("no of odd elem:"+oc);
System.out.println("no of even elem:"+ec);
}
}