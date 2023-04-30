package com.java1.basic.strings;import java.util.Scanner;
public class Strcount2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String st=sc.nextLine();
		int wc=getNumberofwords(st);
		System.out.println( "number of words:"  +wc );

	}

	static int getNumberofwords(String s)
	{
		char ch[]=s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(i==0 && ch[i]!=' ' && ch[i]!=',' && ch[i]!='.' 
					||ch[i]!=' ' && ch[i]!=',' && ch[i]!='.' 
					&& (ch[i-1]==' ' || ch[i-1]==',' || ch[i-1]=='.'))
				count++;
		}
		return count;
	}
}