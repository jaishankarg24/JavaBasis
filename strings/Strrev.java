package com.java1.basic.strings;import java.util.Scanner;
public class Strrev {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String st=sc.nextLine();

		char ch[]=st.toCharArray();
		String rs=" ";
		for (int i=0;i<ch.length;i++)
		{
			int si=i;
			while(i<ch.length && ch[i]!=' ')
			{
				i++;
			}
			int ei=i-1;
			while(ei>=si)
			{
				rs=rs+ch[ei];
				ei--;
			}
			if(i<ch.length)
				rs=rs+ch[i];
		}

		System.out.println("reversed string is:"+rs);
	}
}