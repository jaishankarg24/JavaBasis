package com.java1.basic.strings; import java.util.Scanner;
public class Stroddrev{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		st="";
		for (int i=0;i<ch.length;i++)
		{
			String w=" ";
			while(i<ch.length && ch[i]!=' ')
			{
				w=w+ch[i];
				i++;
			}
			if(w.length()%2==0)
			{
			String rs="";
			int length=w.length();
			for(int j=length-1; j>=0;j--)
				rs=rs+w.charAt(j);
			st=st+rs+" ";	
		}
			else 
			st=st+w+" ";
		}
		System.out.println(st);
	}
}

