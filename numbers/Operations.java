package com.java1.basic.javaprogm.numbers;import java.util.Scanner;
class Operations
{
public static void main(String []args)
{
Scanner scn=new Scanner(System.in);
System.out.println("enter the value a");
int a=scn.nextInt();
System.out.println("enter the value b");
int b=scn.nextInt();
System.out.println("sum is:"+a+"+"+b+"="+(a+b));
System.out.println("diff is:"+a+"-"+b+"="+(a-b));
System.out.println("proc is:"+a+"*"+b+"="+a*b);
System.out.println("quo is:"+a+"/"+b+"="+a/b);
System.out.println("rem is:"+a+"%"+b+"="+a%b);


}
}