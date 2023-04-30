package com.java1.basic.strings;import java.util.Scanner;
public class Strrev1{
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
				rs=ch[ei]+rs;
				ei--;
			}
			if(i<ch.length)
				rs=ch[i]+rs;
		}

		System.out.println("reversed string is:"+rs);
	}
}