package com.java1.basic.recursion;
public class TowerHonoi {
public static void main(String[] args) {
	int n=3;
	char s='s',t='t',d='d';
	
	move(n,s,t,d);
}

static void move(int n,char src, char temp, char dest)
{
	if(n==1)
	{
		System.out.println(n +" disk move from "+ src +" to "+ dest);
		return;
	}
	move (n-1,src,dest,temp);
	System.out.println(n +" disk move from " + src +" to "+ dest);
	move (n-1,temp,src,dest);
}
}
