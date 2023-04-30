package com.java1.basic.javaprogm.numbers;import java.util.Scanner;
public class Count
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the no");
int n=sc.nextInt();

int c=0;
do
{
c++;
n=n/10;
}
while(n!=0);

System.out.println("no of digits"+ c);

}
}