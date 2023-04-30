package com.java1.basic.strings;

import java.util.Scanner;
public class Stranagram {
	public static void main(String[] args) {
		Stranagram a=new Stranagram();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		boolean rs=a.isAnagram(s1,s2);
		if(rs)
			System.out.println("strings are anagram");
		else
			System.out.println("strings are not Anagram");
	}

	public boolean isAnagram(String s1,String s2)
	{
		s1=removeSpace(s1);
		s1=removeSpace(s1);
		if(s1.length()!=s2.length())
			return false;
		s1=toLower(s1);
		s1=toLower(s1);
		char c1[]=sort(s1);
		char c2[]=sort(s2);
		for(int i=0;i<c2.length;i++)
		{
			if(c1[i]!=c2[i])
				return false;
		}
		return true;
	}
	/*method to sort the character*/
	private char[] sort(String s) {
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[j]<ch[i])
				{
					char t=ch[i];
					ch[i]=ch[j];
					ch[j]=t;
				}
			}
		}
		return ch;
	}
	/*method to convert character into lower*/
	private String toLower(String s) {
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=65&&ch[i]<=90)
			{
				ch[i]=(char)(ch[i]+32);
			}
		}
		return new String(ch);
	}
	/*method to remove the spaces*/
	private String removeSpace(String s) {
		char ch[]=s.toCharArray();
		s="";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
				s=s+ch[i];
		}
		return s;
	}
}
