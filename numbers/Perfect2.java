package com.java1.basic.javaprogm.numbers;
public class Perfect2
{
public static void main(String[] args)
{
int count=0;
for(int n=1;n<=1000;n++)
{
boolean pr=isPerfect(n);
if(pr)
{
System.out.println(n + "is a perfect no");
count++;
}
}
System.out.println("no of perfect no;"+count);

}

static boolean isPerfect(int n)
{
int i=1,sum=0;

while(i<=n/2)
{
if(n%i==0)
{
sum=sum+i;
}
i++;

}
return n==sum;
}


}