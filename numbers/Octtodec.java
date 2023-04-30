package com.java1.basic.javaprogm.numbers;import java.util.Scanner;
public class Octtodec
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the no:");
int no=sc.nextInt();


int d1=getocttodec(no);
System.out.println("octal of"+no+"to decimal is"+d1);
}


static int getocttodec(int n)
{
int sum=0,p=0;
while(n!=0)
{
int r=n%10;
sum=sum+r*pow(8,p);
p++;
n=n/10;
}

return sum;
}


static int pow(int n,int p)
{
int pw=1;
while(p>0)
{
pw=pw*n;
p--;
}
return pw;
}

}