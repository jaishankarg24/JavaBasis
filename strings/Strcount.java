package com.java1.basic.strings;import java.util.Scanner;
public class Strcount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String st=sc.nextLine();

		char ch[]=st.toCharArray();

		for (int i=0;i<ch.length;i++)
		{
			String w=" ";
			int c=0;
			while(i<ch.length && ch[i]!=' ')
			{
				w=w+ch[i];
				i++;
				c++;
			}
			if(c>0)
				System.out.println(w+"....."+c);
		}


	}
}