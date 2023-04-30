package com.java1.basic.strings;import java.util.Scanner;
public class Strstartwith {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		boolean rs=isstartwith(s1,s2);
		if(rs)
			System.out.println("string starts with");
		else
			System.out.println("not starts with");
		
	}
	
	static boolean isstartwith(String s1, String s2)
	{
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		int i=0;
		int j=0;
		while(i<c1.length && j<c2.length && c1[i]==c2[j])
		{
			i++;
			j++;
		}
		return j==c2.length;
	}
}