package com.java1.basic.javaprogm.numbers;import java.util.Scanner;
public class Bintooct
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the no:");
int no=sc.nextInt();
int d1=getbintodec(no);
String o1=dectooct(d1);
System.out.println("binary to oct is "+o1);
}


static int getbintodec(int n)
{
int sum=0,p=0;
while(n!=0)
{
int r=n%10;
sum=sum+r*pow(2,p);
p++;
n=n/10;
}

return sum;
}


static int pow(int n,int p)
{
int pw=1;
while(p>0)
{
pw=pw*n;
p--;
}
return pw;
}


static String dectooct(int n)
{
String oct="";
while(n>0)
{
int r=n%8;
oct= r+oct;
n=n/8;
}
return oct;
}
}