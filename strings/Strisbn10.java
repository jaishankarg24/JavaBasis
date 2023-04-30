package com.java1.basic.strings;import java.util.Scanner;
public class Strisbn10 {
	public static void main(String[] args) {
		System.out.println("enter the isbn no:");
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		if(st.length()!=10)
		{
			System.out.println("it is not valid isbn no:");
			return;
		}
		int sum=0;
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch<'0' && ch>'9')
			{
				System.out.println("it is not a valid isbn no");
				return;
			}
			sum=sum+(ch-48)*(st.length()-i);
		}
		if(sum%11==0)
			System.out.println("valid isbn no");
		else
			System.out.println("invalid isbn no");
	}

}
