package com.java1.basic.javaprogm.numbers;import java.util.Scanner;
class Vote
{
public static void main(String []args)
{
Scanner scn=new Scanner(System.in);
System.out.println("enter your age");
int age=scn.nextInt();
if (age>18)
System.out.println("eligible");
else
System.out.println("not eligible");
System.out.println("Thank u");
}
}