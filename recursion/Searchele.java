package com.java1.basic.recursion;
public class Searchele {
	public static void main(String[] args) {
		int a[]={33,44,55,66};
		int in= search(a,33,0);
		if(in>=0)
		{
			System.out.println("present");
		}
		else
			System.out.println("absent");		
	}
	
	static int search(int ar[], int ele,int i)
	{
		if(i>=ar.length || i<0)
			return -1;
		if(ar[i]==ele)
			return i;
		return search (ar, ele, i+1);
	}

}
