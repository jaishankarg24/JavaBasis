package com.java1.basic.javaprogm.numbers;import java.util.Scanner;
public class Prime
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the no");
int num=sc.nextInt();
boolean pr=isPrime(num);
if(pr)
System.out.println(num + "is a prime no");

else
System.out.println(num + "is not a prime no");


}

static boolean isPrime(int n)
{
int i=2;

while(i<=n/2)
{
if(n%i==0)
return false;
i++;
 
}
return true;
}


}