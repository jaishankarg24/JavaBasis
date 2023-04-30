package com.java1.basic.strings;import java.util.Scanner;
public class Strpanagram {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the sentence"); 
	String st=sc.nextLine();
	st=toUpperCase(st);
	int c[]=new int[26];
	char ch[]=st.toCharArray();
	for(int i=0; i<ch.length; i++)
	{
		if(ch[i]>=65 && ch[i]<=90)
			c[ch[i]-65]++;
	}
	for(int i=0;i<c.length;i++)
	{
		if(c[i]==0)
		{
			System.out.println("sentence is not panagram");
			return;
		}
	}
	System.out.println("string is panagram");
}


private static String toUpperCase(String s)
{
	char ch[]=s.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]>=97 && ch[i]<=122)
		{
			ch[i]=(char)(ch[i]-32);
		}
	}
	return new String (ch);
}
}
