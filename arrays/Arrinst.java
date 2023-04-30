package com.java1.basic.javaprogm.arrays;import java.util.Scanner;
public class Arrinst
{
public static void main(String []args)
{
System.out.println("1st array elements:");
int ar1[]=readArr();
System.out.println("2nd array elements:");
int ar2[]=readArr();
System.out.println("after insert:");
int rs[]=add(ar1,ar2,3);
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



static int[] add(int s[], int d[], int in)
{
if(in<0||in>d.length)
{
System.out.println("index is out of range");
System.exit(0);
}

int rs[]=new int[s.length+d.length];

for(int i=0;i<d.length;i++)
{
if(i<in)
rs[i]=d[i];
else
rs[s.length+i]=d[i];
}

for(int i=0;i<s.length;i++)
{
rs[in+i]=s[i];
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