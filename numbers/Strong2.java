package com.java1.basic.javaprogm.numbers;
public class Strong2
{
public static void main(String[] args)
{
int count=0;

for(int n=1;n<=1000;n++)
{
boolean st=isStrong(n);

if(st)
{
System.out.println(n+"is a strong no");
count++;
}
}
System.out.println("no of strong no:"+count);



}

static boolean isStrong(int x)
{
int sum=0,t=x;
while(x!=0)
{
int r=x%10;
sum=sum+fact(r);
x=x/10;
}
return t==sum;
}

static int fact(int n)
{
int f=1;
while(n>0)
{
f=f*n;
n--;
}
return f;
}
}