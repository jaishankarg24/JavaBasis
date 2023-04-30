package com.java1.basic.strings;import java.util.Scanner;

public class Strvowel {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr your sentence");
		String st=sc.nextLine();

		char ch[]=st.toCharArray();
		int v=0;int co=0;int sp=0;int caps=0;int sm=0;int di=0;
		for (int i = 0; i < ch.length; i++)
		{
			if(ch[i]>='A'&&ch[i]<='Z')
			{	caps++;
			if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
				v++;
			else
				co++;
			}

			else if(ch[i]>='a'&&ch[i]<='z')
			{
				sm++;
				if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
						v++;
				else
					co++;
			}
			
			else if(ch[i]>='0'&&ch[i]<='9')
	
				di++;
				else
				sp++;
		
		}
		System.out.println("small letters:"+sm);
		System.out.println("capital letters:"+caps);
		System.out.println("no of vowels:"+v);
		System.out.println("no of consonents:"+co);
		System.out.println("no of digits:"+di);
		System.out.println("special characters:"+sp);
	}
}
