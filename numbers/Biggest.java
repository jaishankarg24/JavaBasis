package com.java1.basic.javaprogm.numbers;class Biggest
{
int getbiggest(int a,int b,int c)
{
if(a>=b && a>=c)
return a;
else if(b>=c)
return b;
else
return c;
}

public static void main(String[] args)
{
Biggest b=new Biggest();
int big=b.getbiggest(20,35,18);
System.out.println("biggest value is:"+big);
int big1=b.getbiggest(50,35,19);
System.out.println("biggest value is:"+big1);
}
}