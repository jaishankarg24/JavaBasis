package com.java1.basic.javaprogm.numbers;import java.util.Scanner;
public class Perfect
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the no");
int num=sc.nextInt();

int i=1,sum=0;

while(i<=num/2)
{
if(num%i==0)
{
sum=sum+i;
}
i++;

}

if(sum==num)
System.out.println(num + "is a perfect no");

else
System.out.println(num + "is a not perfect no");

}
}