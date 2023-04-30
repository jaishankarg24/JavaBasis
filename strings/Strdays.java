package com.java1.basic.strings;import java.util.Arrays;

public class Strdays {
	int dd,mm,yy;
	int mon[]={31,28,31,30,31,30,31,31,30,31,30,31};
		public Strdays(int dd,int mm,int yy)
		{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	    }
@Override
	public String toString() {
		return "Strdays [" + dd + "/"+  mm +"/ "+ yy +"]" ;
	}

public int getDays()
{
	int days=(yy-1)*365;
	days=days+dd;
	for(int i=0;i<mm-1;i++)
	{
		days=days+mon[i];
	}
	if(mm>2)
	{
		if(yy%400==0 || yy%4==0 && yy%100!=0)
			days++;	
	}
	int y=yy-1;
	days=days+(y/4-y/100+y/4);
			return days;
}
public static void main(String[] args) {
	
	Strdays d1=new Strdays (12,9,1995);
	Strdays d2=new Strdays (12,9,2017);
	int days=getNumberOfDays(d1,d2);
	System.out.println("no of days bw "+ d1 +" and " + d2);
	System.out.println(days);
	System.out.println("how many years");
	System.out.println(days/365);
	}
private static int getNumberOfDays(Strdays d1,Strdays d2)
{
int nd1=d1.getDays();
int nd2=d2.getDays();
if(nd1>nd2)
	return nd1-nd2;
else
	return nd2-nd1;

}
}
