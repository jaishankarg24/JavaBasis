package com.java1.basic.strings;import java.util.Scanner;
public class Strs1s2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		boolean rs=ispresent(s1,s2);
		if(rs)
			System.out.println("string present");
		else
			System.out.println("not present");

	}

	static boolean ispresent(String s1, String s2)
	{
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		for(int i=0;i<c1.length;i++)
		{
			int t=i;
			int j=0;
			while(t<c1.length && j<c2.length && c1[t]==c2[j])
			{
				t++;
				j++;
			}
			if(j==c2.length)
				return true;
		}
			
				return false ;
		
	}
}