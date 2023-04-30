package com.java1.basic.strings;import java.util.Scanner;
public class Strisbn13 {
	public static void main(String[] args) {
		System.out.println("enter the isbn no:");
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		if(st.length()!=13)
		{
			System.out.println("it is not valid isbn no:");
			return;
		}
		int sum=0;
		for(int i=0;i<st.length()-1;i++)
		{
			char ch=st.charAt(i);
			if(ch<'0' && ch>'9')
			{
				System.out.println("it is not a valid isbn no");
				return;
			}
			if(i%2==0)
				sum=sum+(ch-48)*1;
			else
				sum=sum+(ch-48)*3;

		}
		int r=sum%10;
		r=10-r;
		if(r==st.charAt(12)-48)
			System.out.println("valid isbn no");
		else
			System.out.println("invalid isbn no");
	}

}
