package com.java1.basic.javaprogm.numbers;import java.util.Scanner;
public class Octtobin
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the no:");
int no=sc.nextInt();
int d1=getocttodec(no);
String b1=dectobin(d1);
System.out.println("octal to binary is "+b1);
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


static String dectobin(int n)
{
String bin="";
while(n>0)
{
int r=n%2;
bin= r+bin;
n=n/2;
}
return bin;
}

}