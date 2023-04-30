package com.java1.basic.javaprogm.numbers;class Biggest2
{
int getbiggest(int a,int b)
{
if(a>=b)
return a;
else 
return b;

}

public static void main(String[] args)
{
Biggest2 b=new Biggest2();
int big=b.getbiggest(100,35);
System.out.println("biggest value is:"+big);
int big1=b.getbiggest(50,350);
System.out.println("biggest value is:"+big1);
}
}