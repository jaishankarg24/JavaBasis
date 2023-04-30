package com.java1.basic.strings;import java.util.Scanner;
public class Strswap{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String st=sc.nextLine();
		st=swap(st);
		System.out.println("after swap");
		System.out.println(st);
	}

	static String swap(String s)
	{
		char ch[]=s.toCharArray();

		for(int i=0;i<ch.length;i++)
		{
			int f=i;
			if(i==0 && ch[i]!=' ' ||ch[i]!=' ' &&ch[i-1]==' ')
			{
				f=i;
			}

			while(i<ch.length && ch[i]!=' ')i++;

			int l=i-1;

			char t=ch[f];
			ch[f]=ch[l];
			ch[l]=t;
		}


		s=new String(ch);
		return s;
	}
}