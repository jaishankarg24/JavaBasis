package com.java1.basic.javaprogm.numbers;
public class Prime2
{
public static void main(String[] args)
{
int count=0;
int sum=0;
for(int n=1;n<=100;n++)
{
boolean pr=isPrime(n);
if(pr)
{
sum=sum+n;
count++;
}
}
System.out.println("sum of prime no:"+sum);
System.out.println("avg of prime no:"+sum/count);
}

static boolean isPrime(int n)
{
int i=2;

while(i<=n/2)
{
if(n%i==0)
return false;
i++;
 
}
return true;
}


}