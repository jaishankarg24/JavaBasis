package com.java1.basic.javaprogm.numbers;import java.util.Scanner;
class Sumofno
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
int sum=0;


for(int i=1;i<=n;i++)
{
sum=sum+i;
}

System.out.println("first"+n+"natural no is:"+sum);


System.out.println("thank u");
}
}