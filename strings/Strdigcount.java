package com.java1.basic.strings;import java.util.Scanner;
public class Strdigcount {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the sentence"); 
	String st=sc.nextLine();
	int sum=0;
	char ch[]=st.toCharArray();
	for(int i=0; i<ch.length; i++)
	{
		if(ch[i]>=48 && ch[i]<='9')
			sum=sum+(ch[i]-48);
	}
	System.out.println(sum);
}
}
