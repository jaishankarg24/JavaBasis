package com.java1.basic.strings;import java.util.Scanner;
public class Strmailid {
	public static void main(String[] args) {
		System.out.println("enter ur gmail");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		boolean x=check(st);
		if(x)
			System.out.println("it is valid mail id");
		else 
			System.out.println("it is invalid mail id");
	}

	static boolean check(String st1)
	{
		String s=".com";
		char a[]=s.toCharArray();
		char[] ch=st1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			while(i<ch.length && ch[i]!='@')
			{
				i++;
			}
			int si=i+1;
			if(ch[si]=='.')
				return false;
			
			for(int k=si; k<ch.length; k++)
			{
				int t=k;
				for(int m=0; m<a.length; m++)
				{
					if(ch[t]==a[m])
					{
						t++;
					}
				}
				if((t-si)==a.length)
					return true;
			}
		}
		return false;
	}
}
