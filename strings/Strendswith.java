package com.java1.basic.strings;import java.util.Scanner;
public class Strendswith {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		boolean rs=isendwith(s1,s2);
		if(rs)
			System.out.println("string ends with");
		else
			System.out.println("not ends with");
		
	}
	
	static boolean isendwith(String s1, String s2)
	{
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		int i=c1.length-1;
		int j=c2.length-1;
		while(i>=0 && j>=0 && c1[i]==c2[j])
		{
			i--;
			j--;
		}
		return j==-1;
	}
}