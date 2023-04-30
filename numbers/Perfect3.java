package com.java1.basic.javaprogm.numbers;
public class Perfect3
{
public static void main(String[] args)
{
int count=0;
int sum=0;
for(int n=1;n<=1000;n++)
{
boolean pr=isPerfect(n);
if(pr)
{

sum=sum+n;
count++;
}
}
System.out.println("sum of perfect no:"+sum);
System.out.println("avg of perfect no:"+sum/count);

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