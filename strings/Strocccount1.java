package com.java1.basic.strings;
public class Strocccount1 {
public static void main(String[] args) {
	String st="CHANDana";
	int c[]=new int[129];
	for (int i = 0; i < st.length(); i++) 
	{
		c[st.charAt(i)]++;
		
	}
	for(int i=0;i<c.length;i++)
	{
			if(i>=65 && i<=90)
			{
				c[i]=c[i]+c[i+32];
				c[i+32]=0;
			}
			if(c[i]!=0)
		
			System.out.println((char)i+"......"+c[i]);
	}
}
}
