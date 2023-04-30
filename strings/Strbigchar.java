package com.java1.basic.strings;import java.util.Scanner;
public class Strbigchar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String st=sc.nextLine();

		String bw ="";
		int bc=0;
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
			if(c>bc)
			{
				bw=w;
				bc=c;
			}
		}
		System.out.println(bw);
		System.out.println(bc);
	}


}
