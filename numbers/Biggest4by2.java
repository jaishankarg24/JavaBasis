package com.java1.basic.javaprogm.numbers;class Biggest4by2
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
System.out.println("...................");


int big1=b.getbiggest(b.getbiggest(50,350),55);
System.out.println("biggest value is:"+big1);
System.out.println("...................");

int big2=b.getbiggest(b.getbiggest(50,35),b.getbiggest(77,55));
System.out.println("biggest value is:"+big2);
System.out.println("...................");

}
}