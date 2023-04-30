package com.java1.basic.javaprogm.numbers;import java.util.Scanner;
public class Desarium
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the no");
int num=sc.nextInt();

int t=num;
int c=getcount(num);
int sum=0;
while(num!=0)
{
int r=num%10;
sum=sum+pow(r,c);
num=num/10;
c--;
}
if(sum==t)

System.out.println(t+"is desarium no");
else
System.out.println(t+"is not a desarium no");
}

static int getcount(int x)
{
int c=0;
while(x!=0)
{
c++;
x=x/10;
}
return c;
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