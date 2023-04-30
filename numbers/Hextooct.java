package com.java1.basic.javaprogm.numbers;public class Hextooct
{
public static void main(String[] args)
{
String st="6fC";
int dec=hextodec(st);
String o=dectooct(dec);
System.out.println("hex to bin is: " + o);

}


static int hextodec(String s1)
{
int sum=0,p=0;
for(int i=s1.length()-1; i>=0; i--, p++)
{
char ch=s1.charAt(i);
if(ch>='A' && ch<='F')
sum=sum+(ch-55)*pow(16,p);
else if (ch>='a' && ch<='f')
sum=sum+(ch-87)*pow(16,p);
else
sum=sum+(ch-48)*pow(16,p);
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


static String dectooct(int n)
{
String oct="";
while(n>0)
{
int r=n%8;
oct= r+oct;
n=n/8;
}
return oct;
}

}