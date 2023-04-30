package com.java1.basic.javaprogm.numbers;import java.util.Scanner;
public class Dectooct
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the dec no:");
int no=sc.nextInt();

String b1=dectobin(no);
System.out.println("decimal of "+ no+ "is"+ b1);

}

static String dectobin(int n)
{
String bin="";
while(n>0)
{
int r=n%8;
bin= r+bin;
n=n/8;
}
return bin;
}
}