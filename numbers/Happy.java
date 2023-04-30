package com.java1.basic.javaprogm.numbers;import java.util.Scanner;
public class Happy
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the no:");
int no=sc.nextInt();

if(isHappy(no))

System.out.println(no+"is happy no");

else
System.out.println(no+"is not a happy no");
}

static boolean isHappy(int n)
{
while(n>9)
{
int sum=0;
while(n!=0)
{
int r=n%10;
sum=sum+r*r;
n=n/10;
}
n=sum;
}
return n==1 || n==7;
}

}