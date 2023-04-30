package com.java1.basic.javaprogm.numbers;import java.util.Scanner;
public class Dectohec
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the dec no:");
int no=sc.nextInt();

String h1=dectohec(no);
System.out.println("dec of "+ no+ "is"+ h1);

}

static String dectohec(int n)
{
String hec="";
while(n>0)
{
int r=n%16;
if(r<10)
hec= r+hec;
else
hec=(char)(r+55)+hec;
n=n/16;
}
return hec;
}
}