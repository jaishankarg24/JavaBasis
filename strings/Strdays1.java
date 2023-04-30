package com.java1.basic.strings;import java.util.Arrays;
import java.util.Scanner;
public class Strdays1 {
	int day,month,year;

	public Strdays1(int x,int y,int z)
	{
		this.day=x;
		this.month=y;
		this.year=z;
	}
	@Override
	public String toString() {
		return this.day+"-"+this.month+"-"+this.year;
	}

	public static void main(String[] args) {

		Strdays1 d1=new Strdays1 (12,9,1995);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many days");
		int n=sc.nextInt();
		Strdays1 d=getdate(d1,n);
		if(d.year%4==0)
		{
			if(d.month==2)
			{
				d.day=d.day+1;
			}
		}
		System.out.println(d);
	}

	public static Strdays1 getdate(Strdays1 d,int n)
	{
		int mon[]={31,28,31,30,31,30,31,31,30,31,30,31};
		int y=n/365; // how many years
		int m=n/30; //how many months
		d.year=d.year+y;
		d.month=d.month+m;
		int da;
		if(y>0)
			da=n-(y*365);
		    if(m>0)
			da=n-(m*30);
		else
			da=n;
		d.day=d.day+da;

		for(int i=0; i<mon.length ;i++)
		{
			if(d.month==i+1)
			{
				if(d.day>mon[i])
				{
					d.day=d.day-mon[i];
					d.month=d.month+1;
					if(d.month>12)
					{
						d.month=d.month-12;
						d.year=d.year+1;
					}
				}
			}
		}
		return d;
	}


}