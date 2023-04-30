package com.java1.basic.strings;import java.util.Scanner;
public class Strcap{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String st=sc.nextLine();
		st=initcap(st);
		System.out.println("after in it cap");
		System.out.println(st);
	}

	static String initcap(String s)
	{
		char ch[]=s.toCharArray();

		for(int i=0;i<ch.length;i++)
		{
			if(i==0 && ch[i]!=' ' ||ch[i]!=' ' &&ch[i-1]==' ')
			{
				if(ch[i]>='a' && ch[i]<='z')
				{
					ch[i]=(char)(ch[i]-32);
				}
			}
			else
			{
				if(ch[i]>='A' && ch[i]<='Z')
				{
					ch[i]=(char)(ch[i]+32);
				}

			}
		}


		s=new String(ch);
		return s;
	}
}