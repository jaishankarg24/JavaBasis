package com.java1.basic.hashcode;


public class Mobile
{
	String model;
	long mobnum;
	
	public Mobile(String model , long mobnum)
	{
		this.model=model;
		this.mobnum=mobnum;
	}
	@Override
	public int hashCode()
	{
		return (int) this.mobnum;
	}
}
