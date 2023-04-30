package com.java1.basic.javaprogm.numbers;import java.util.Scanner;
public class Octtohex
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the no:");
int no=sc.nextInt();
int d1=getocttodec(no);
String h1=dectohec(d1);
System.out.println("octal to hex is "+h1);
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