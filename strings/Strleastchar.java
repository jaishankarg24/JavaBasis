package com.java1.basic.strings;import java.util.Scanner;
public class Strleastchar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		//String st=new Scanner(System.in).nextLine();
		String st=sc.nextLine();

		
		char ch[]=st.toCharArray();
		String sw ="";
		
		int b=ch.length;
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
			if(b>c)
			{
				sw=w;
				b=c;
			}
		}
		System.out.println(sw);
		System.out.println(b);
	}


}
