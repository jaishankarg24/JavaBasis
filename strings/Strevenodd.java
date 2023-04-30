package com.java1.basic.strings;import java.util.Scanner;
public class Strevenodd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String st=sc.nextLine();

		char ch[]=st.toCharArray();
		String rs ="";
		int even=0;
		int odd=0;


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
			{
				System.out.println(w+"......"+c);
			}
			if(c%2==0)
			{
				even++;
			}
			else
				odd++;


		}
		System.out.println(" no of odd words:"+odd);
		System.out.println("no of even words:"+even);
	}


}
