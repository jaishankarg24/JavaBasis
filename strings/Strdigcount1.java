package com.java1.basic.strings;import java.util.Scanner;
public class Strdigcount1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the sentence"); 
		String st=sc.nextLine();
		int sum=0;
		char ch[]=st.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			int s=0;
			while(i<ch.length && ch[i]>=48 && ch[i]<='9')
			{
				s=s*10+(ch[i]-48);
				i++;
			}
			sum=sum+s;
		}
		System.out.println(sum);
	}
}
