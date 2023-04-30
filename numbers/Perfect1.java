package com.java1.basic.javaprogm.numbers;import java.util.Scanner;
public class Perfect1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the no");
int num=sc.nextInt();
boolean pr=isPerfect(num);
if(pr)
System.out.println(num + "is a perfect no");

else
System.out.println(num + "is a not perfect no");

System.out.println("enter the no");
int num1=sc.nextInt();
System.out.println(num1+ "is it perfect no: "+ isPerfect(num1));


}

static boolean isPerfect(int n)
{
int i=1,sum=0;

while(i<=n/2)
{
if(n%i==0)
{
sum=sum+i;
}
i++;

}
return n==sum;
}


}