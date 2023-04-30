package com.java1.basic.javaprogm.numbers;
public class Happy1
{
public static void main(String[] args)
{
int count=0;
for(int i=1;i<=1000;i++)
{
int no=i;

if(isHappy(no))
{
System.out.println(no+"is happy no");
count++;
}
}
System.out.println("no of happy no bw 1 to 1000 are:"+count);
}

static boolean isHappy(int n)
{
while(n>9)
{
int sum=0;
while(n!=0)
{
int r=n%10;
sum=sum+r*r;
n=n/10;
}
n=sum;
}
return n==1 || n==7;
}

}