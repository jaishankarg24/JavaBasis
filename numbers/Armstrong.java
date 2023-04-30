package com.java1.basic.javaprogm.numbers;


public class Armstrong
{
public static void main(String[] args)
{

int count=0;
for(int i=1;i<=10000;i++)
{
int n=i;
int c=getcount(n);
int sum=0;
while(n!=0)
{
int r=n%10;
sum=sum+pow(r,c);
n=n/10;
}
if(sum==i)
{
System.out.println(i+"is armstrong no");
count++;
}
}
System.out.println("no of armstrong no:"+count);
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