package com.java1.basic.javaprogm.numbers;import java.util.Scanner;
class Multiplication
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();

for(int i=1;i<=10;i++)
{
System.out.println(n+"*"+i+"="+n*i);
}

System.out.println("thank u");
}
}