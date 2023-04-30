package com.java1.basic.strings;import java.util.Scanner;
public class Strtoint {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the sentence"); 
		String st=sc.nextLine();
		int i=strToInt(st);
		System.out.println(i);
		System.out.println(i+10);
		
	}
	
	private static int strToInt(String s)
	{
		char ch[]=s.toCharArray();
		int sum=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='0' && ch[i]<='9')
			{
				sum=sum*10+(ch[i]-48);
			}
			else
			{
				System.out.println("invalid number");
				System.exit(0);
			}
		}
	return sum;	
	}
}