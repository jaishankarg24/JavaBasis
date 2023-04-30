package com.java1.basic.javaprogm.numbers;import java.util.Scanner;
public class Factorial
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int num=sc.nextInt();
Factorial f=new Factorial();
int fc=f.getfact(num);
System.out.println("factorial of"+num+"is"+fc);
}


int getfact(int n)
{
int fact=1,i=1;
while(i<=n)
{
fact=fact*i;
i++;
}
return fact;
}

}