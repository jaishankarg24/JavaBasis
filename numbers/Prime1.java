package com.java1.basic.javaprogm.numbers;
public class Prime1
{
public static void main(String[] args)
{
int count=0;

for(int n=1;n<=100;n++)
{
boolean pr=isPrime(n);
if(pr)
{
System.out.println(n+"is a prime");
count++;
}
}
System.out.println("no of prime no:"+count);

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