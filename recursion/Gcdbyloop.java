package com.java1.basic.recursion;
public class Gcdbyloop {
	public static void main(String[] args) {
		int i=1,min=0,gcd=0;
		int m=18, n=30;
		if(m<n)
			min=m;
		else
			min=n;
		while(i<=min)
		{
			if(m%i==0 && n%i==0)
				gcd=i;
			i++;
		}
		System.out.println(gcd);
	}

}
	
