package com.java1.basic.javaprogm.numbers;import java.util.Scanner;
public class Strong
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the no");
int num=sc.nextInt();
boolean st=isStrong(num);

if(st)
System.out.println(num+"is a strong no");
else
System.out.println(num+"is not astrong no");

}

static boolean isStrong(int x)
{
int sum=0,t=x;
while(x!=0)
{
int r=x%10;
sum=sum+fact(r);
x=x/10;
}
return t==sum;
}

static int fact(int n)
{
int f=1;
while(n>0)
{
f=f*n;
n--;
}
return f;
}
}