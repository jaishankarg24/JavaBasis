package com.java1.basic.recursion;
public class Lcm {
public static void main(String[] args) {
	int a=18,b=30,c=18,d=30;
	int l=lcm(a,b,c,d);
	System.out.println(l);
}
static int lcm(int a,int b, int c,int d)
{
	if(a==b)
		return a;
	if(a>b)
		return lcm(b,a,d,c);
	return lcm(a+c,b,c,d);
}
}
