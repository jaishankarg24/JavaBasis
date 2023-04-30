package com.java1.basic.javaprogm.numbers;import java.util.Scanner;
public class Reverse
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the no");
int x=sc.nextInt();
Reverse r1=new Reverse();
int rn=r1.getReverse(x);
System.out.println("reverse of"+ x+ "is"+rn);
}

int getReverse(int n)
{
int rev=0;
while(n!=0)
{
int r=n%10;
rev=rev*10+r;
n=n/10;
}
return rev;
}

}