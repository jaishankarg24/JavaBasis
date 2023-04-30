package com.java1.basic.javaprogm.numbers;import java.util.Scanner;
public class Reverse1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the no");
int x=sc.nextInt();
Reverse1 r1=new Reverse1();
String rn=r1.getReverse(x);
System.out.println("reverse of"+ x+ "is"+rn);
}

String getReverse(int n)
{
String rev="";
while(n!=0)
{
int r=n%10;
rev=rev+r;
n=n/10;
}
return rev;
}

}